package com.ddu.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ddu.model.Computer;

public interface ComputerRepository extends CrudRepository<Computer, Integer> {
	
	List<Computer> findBymachineidAndLocation(String machineid, String location);
	List<Computer> findBylocation(String location);

}
