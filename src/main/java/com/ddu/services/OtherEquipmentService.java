package com.ddu.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;
import org.springframework.stereotype.Service;


import com.ddu.model.OtherEquipment;
import com.ddu.repository.OtherEquipmentRepository;

@Service
@Transactional
public class OtherEquipmentService {

	private final OtherEquipmentRepository otherEquipmentRepository;
	
	public OtherEquipmentService(OtherEquipmentRepository otherEquipmentRepository)
	{
		this.otherEquipmentRepository=otherEquipmentRepository;
	}
	
	public void save(OtherEquipment otherEquipment)
	{
		otherEquipmentRepository.save(otherEquipment);
	}
	
	public int find(String type,String location)
	{
		List<OtherEquipment> otherEquipmentList = (List<OtherEquipment>) otherEquipmentRepository.findBytypeAndLocation(type, location);
		int size=otherEquipmentList.size();
		return size;
	}
	
	public List<OtherEquipment> findlocation(String location)
	{
		List<OtherEquipment> otherEquipmentList = (List<OtherEquipment>) otherEquipmentRepository.findBylocation(location);
		return otherEquipmentList;
	}
	public List<OtherEquipment> findtype(String type)
	{
		List<OtherEquipment> otherEquipmentList = (List<OtherEquipment>) otherEquipmentRepository.findBytype(type);
		return otherEquipmentList;
	}
	
	public int findId(String lid)
	{
		List<OtherEquipment> otherEquipmentList = (List<OtherEquipment>) otherEquipmentRepository
		           .findBylogicalid(lid);
		int aid=-0; 
		if (otherEquipmentList != null) 
		    {
		        for (OtherEquipment otherEquipment1 : otherEquipmentList) 
		        {
		           aid= otherEquipment1.getEid();
		        }
		    }
		else
		{
			
		}
		return aid;
	}
	
	
	public void saveList (List<OtherEquipment> OE)
	{
		//computerRepository.save(computer);
		List<OtherEquipment> list1= new ArrayList<>();
		otherEquipmentRepository.saveAll(OE).forEach(list1::add);
	}
	
}
