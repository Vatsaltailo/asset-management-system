package com.ddu.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ddu.model.SubEquipment;

public interface SubEquipmentRepository extends CrudRepository<SubEquipment, Integer> {
	
	List<SubEquipment> findBylogicalid(String logicalid);

}
