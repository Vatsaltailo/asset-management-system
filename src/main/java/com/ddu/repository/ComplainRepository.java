package com.ddu.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ddu.model.Complain;



public interface ComplainRepository extends CrudRepository<Complain, Integer> {
	
	List<Complain>findBycomplainid(int complain_id);	

}
