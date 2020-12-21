package com.ddu.services;






import java.util.List;

import javax.transaction.Transactional;



import org.springframework.stereotype.Service;

import com.ddu.model.Complain;

import com.ddu.repository.ComplainRepository;




@Service
@Transactional
public class ComplainService {

private final ComplainRepository complainRepository;
	
	public ComplainService(ComplainRepository complainRepository)
	{
		this.complainRepository=complainRepository;
	}
	
	public List<Complain> listall()
	{
		return (List<Complain>) complainRepository.findAll();
	}
	
	public List<Complain> findcomplainid(int complainid)
	{
		List<Complain> complain = (List<Complain>) complainRepository.findBycomplainid(complainid);
		if(complain != null)
		{
			for(Complain comp1:complain)
			{
				comp1.setStatus("Solved");
			}
		}
		return complain;
	}
	
	
	public void save(Complain complain)
	{
		
		complainRepository.save(complain);
	}
}
