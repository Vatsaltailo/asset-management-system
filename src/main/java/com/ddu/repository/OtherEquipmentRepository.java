package com.ddu.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.ddu.model.OtherEquipment;

public interface OtherEquipmentRepository extends CrudRepository<OtherEquipment, Integer> {

	List<OtherEquipment> findBytypeAndLocation(String type, String location);
	List<OtherEquipment> findBylogicalid(String logicalid);
	List<OtherEquipment> findBylocation(String location);
	List<OtherEquipment> findBytype(String type);
}
