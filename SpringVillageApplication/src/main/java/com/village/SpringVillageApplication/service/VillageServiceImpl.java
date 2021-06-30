package com.village.SpringVillageApplication.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.village.SpringVillageApplication.model.CityDetails;
import com.village.SpringVillageApplication.model.VillageDetails;
import com.village.SpringVillageApplication.repository.CityRepository;
import com.village.SpringVillageApplication.repository.VillageRepository;

@Service
public class VillageServiceImpl implements VillageService {

	@Autowired
	private VillageRepository villageRepository;
	
	@Autowired
	private CityRepository cityRepository;
	
	@Override
	public VillageDetails createVillage(VillageDetails village) {
		List<VillageDetails> villageList=new ArrayList<VillageDetails>();
		villageList.add(village);
		for(CityDetails city:village.getCities())
		{
			city.setVillage(villageList);
			this.cityRepository.save(city);
		}
		return this.villageRepository.save(village);
	}

	@Override
	public List<VillageDetails> displayVillage() {
		return this.villageRepository.findAll();
	}

}
