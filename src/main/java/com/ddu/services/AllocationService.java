package com.ddu.services;

import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

import com.ddu.model.Allocation;
import com.ddu.repository.AllocationRepository;

@Service
@Transactional
public class AllocationService {

	private final AllocationRepository allocationRepository;
	
	public AllocationService(AllocationRepository allocationRepository)
	{
		this.allocationRepository=allocationRepository;
	}
	
	public void save(Allocation allocation)
	{
		allocationRepository.save(allocation);
	}
}
