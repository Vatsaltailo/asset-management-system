package com.ddu.services;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.stereotype.Service;


import com.ddu.model.FixedAsset;
import com.ddu.repository.FixedAssetRepository;

@Service
@Transactional
public class FixedAssetService {

	private final FixedAssetRepository fixedAssetRepository;
	
	public FixedAssetService(FixedAssetRepository fixedAssetRepository)
	{
		this.fixedAssetRepository=fixedAssetRepository;
	} 
	
	public void save (FixedAsset fixedAsset)
	{
		fixedAssetRepository.save(fixedAsset);
	}
	
	public List<FixedAsset> listall()
	{
		return (List<FixedAsset>) fixedAssetRepository.findAll();
	}
	public void delete(int billid)
	{
		 fixedAssetRepository.deleteById(billid);;
	}
	
	
	public int find(FixedAsset fixedasset)
	{
		String billno=fixedasset.getBillno();
		String type=fixedasset.getType();
		int quantity=fixedasset.getQuantity();
		List<FixedAsset> fa = (List<FixedAsset>) fixedAssetRepository.findBybillnoAndTypeAndQuantity(billno, type, quantity);
		int i=0; 
		if (fa != null) 
		    {
		        for (FixedAsset fa1 : fa) 
		        {
		        i=fa1.getBillid();    
		        }
		    }          
		return i;
		
	}
}
