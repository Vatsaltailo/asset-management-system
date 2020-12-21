package com.ddu.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.ddu.model.Admin;
import com.ddu.repository.AdminRepository;


@Service
@Transactional
public class AdminService {
	
	private AdminRepository adminRepository;
	
	public AdminService(AdminRepository adminRepository)
	{
		this.adminRepository=adminRepository;
	}
	
	public void save(Admin admin)
	{
		adminRepository.save(admin);
	}
	
	public int validate(Admin admin)
	{
		StringBuffer retBuf = new StringBuffer();
		int i=100;

		List<Admin> adminList = (List<Admin>) adminRepository
	           .findByaidAndPassword(admin.getAid(), admin.getPassword());
	
	    if (adminList != null) 
	    {
	        for (Admin admin1 : adminList) 
	        {
	            retBuf.append("user name = ");
	            retBuf.append(admin1.getAid());
	            retBuf.append(", password = ");
	            retBuf.append(admin1.getPassword());
	            retBuf.append("<br/>");
	            i=0;
	        }
	    }
	    else
	    {
	        retBuf.append("invalid");
	        i=1;
	    }
	
	    if (retBuf.length() == 0) {
	        retBuf.append("invalid");
	        i=1;
	    }
	    return  i;
	    //System.out.println(retBuf);
	}
}
