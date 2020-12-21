package com.ddu.services;



import java.util.List;

import javax.transaction.Transactional;
import org.springframework.stereotype.Service;


import com.ddu.model.Recurring;

import com.ddu.repository.RecurringRepository;

@Service
@Transactional
public class RecurringService {

	private final RecurringRepository recurringRepository;
	
	public RecurringService(RecurringRepository recurringRepository)
	{
		this.recurringRepository=recurringRepository;
	}
	
	public void save(Recurring recurring)
	{
		recurringRepository.save(recurring);
	}
	public void delete(int billid)
	{
		 recurringRepository.deleteById(billid);;
	}
	
	public List<Recurring> listall()
	{
		return (List<Recurring>) recurringRepository.findAll();
	}
	public int find(String type)
	{
		int billid=-99;
		List<Recurring> recurringtList = (List<Recurring>) recurringRepository.findBytype(type);
		if(recurringtList != null)
		{
			for(Recurring r:recurringtList)
			{
				if(r.getAvailable()!= 0)
				{
					r.setAvailable(r.getAvailable()-1);
					billid=r.getBillid();
					break;
				}
			}
		}
		return billid;
	}
	/*public int find(OtherEquipment otherEquipment)
	{
		List<OtherEquipment> otherEquipmentList = (List<OtherEquipment>) otherEquipmentRepository
		           .findBytypeAndLocation(otherEquipment.getType(), otherEquipment.getLocation());
		int size=otherEquipmentList.size();
		return size;
	}*/
	
	
	
}
