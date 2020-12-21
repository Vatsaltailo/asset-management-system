package com.ddu.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.ddu.model.FixedAsset;

public interface FixedAssetRepository extends CrudRepository<FixedAsset, Integer> {

	List<FixedAsset> findBybillnoAndTypeAndQuantity(String billno, String type,int quantity);
}
