package com.ddu.repository;



import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.ddu.model.Recurring;

public interface RecurringRepository extends CrudRepository<Recurring, Integer> {

	List<Recurring> findBytype(String type);
}
