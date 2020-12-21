package com.ddu.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ddu.model.Admin;

public interface AdminRepository extends CrudRepository<Admin, Integer> {
	
	List<Admin> findByaidAndPassword(String aid, String password);

	
}
