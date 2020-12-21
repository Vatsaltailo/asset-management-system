package com.ddu.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;
import org.springframework.stereotype.Service;


import com.ddu.model.Computer;

import com.ddu.repository.ComputerRepository;

@Service
@Transactional
public class ComputerService {
	
	private final ComputerRepository computerRepository;
	
	public ComputerService(ComputerRepository computerRepository)
	{
		this.computerRepository=computerRepository;
	}
	
	public void save(Computer computer)
	{
		computerRepository.save(computer);
	}
	
	public int find(Computer computer)
	{
		int comid=-1;
		List<Computer> compList = (List<Computer>) computerRepository
		           .findBymachineidAndLocation(computer.getMachineid(),computer.getLocation());
		if(compList != null)
		{
			for(Computer comp1:compList)
			{
				comid=comp1.getComid();
			}
		}
		return comid;
	}
	
	public List<Computer> findlocation(String location)
	{
		List<Computer> computer = (List<Computer>) computerRepository.findBylocation(location);
		return computer;
	}
	

	public List<Computer> listall()
	{
		return (List<Computer>) computerRepository.findAll();
	}
	
	public void saveList (List<Computer> comp)
	{
		//computerRepository.save(computer);
		List<Computer> list1= new ArrayList<>();
		computerRepository.saveAll(comp).forEach(list1::add);
	}
}
