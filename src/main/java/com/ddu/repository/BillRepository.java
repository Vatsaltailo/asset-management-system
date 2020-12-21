package com.ddu.repository;

import org.springframework.data.repository.CrudRepository;

import com.ddu.model.Bill;

public interface BillRepository extends CrudRepository<Bill, Integer> {

}
