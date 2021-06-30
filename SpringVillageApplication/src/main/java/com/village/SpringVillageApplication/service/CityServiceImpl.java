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
public class CityServiceImpl implements CityService {

	@Autowired
	private CityRepository cityReposiotry;

	@Autowired
	private VillageRepository villageRepository;

	@Override
	public CityDetails createCity(CityDetails city) {
		List<CityDetails> cityList = new ArrayList<CityDetails>();
		for (VillageDetails village : city.getVillage()) {
			village.setCities(cityList);
			this.villageRepository.save(village);
		}
		return this.cityReposiotry.save(city);
	}

	@Override
	public List<CityDetails> displayCity() {
		return this.cityReposiotry.findAll();
	}

	@Override
	public List<CityDetails> displayByCityName(String cityName) {
		return this.cityReposiotry.findByCityName(cityName);
		
	}

}
