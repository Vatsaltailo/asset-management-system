package com.ddu.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.ddu.model.SubEquipment;
import com.ddu.repository.SubEquipmentRepository;

@Service
@Transactional
public class SubEquipmentService {

	private final SubEquipmentRepository subEquipmentRepository;
	
	public SubEquipmentService(SubEquipmentRepository subEquipmentRepository)
	{
		this.subEquipmentRepository=subEquipmentRepository;
	}
	
	public void save(SubEquipment subEquipment)
	{
		subEquipmentRepository.save(subEquipment);
	}
	
	public int findId(String lid)
	{
		List<SubEquipment> subEquipmentList = (List<SubEquipment>) subEquipmentRepository
		           .findBylogicalid(lid);
		int aid=-0; 
		if (subEquipmentList != null) 
		    {
		        for (SubEquipment subEquipment1 : subEquipmentList) 
		        {
		           aid= subEquipment1.getSubequiid();
		        }
		    }
		else
		{
			
		}
		return aid;
	}
}
