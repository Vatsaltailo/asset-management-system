package com.ddu.services;

import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

import com.ddu.model.Bill;
import com.ddu.repository.BillRepository;

@Service
@Transactional
public class BillService {

	private final BillRepository billRepository;
	
	public BillService(BillRepository billRepository)
	{
		this.billRepository=billRepository;
	}
	
	public void save(Bill bill)
	{
		billRepository.save(bill);
	}
	
}
