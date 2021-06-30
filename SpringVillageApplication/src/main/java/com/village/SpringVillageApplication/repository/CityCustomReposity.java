package com.village.SpringVillageApplication.repository;

import java.util.List;

import com.village.SpringVillageApplication.model.CityDetails;

public interface CityCustomReposity {
	
	List<CityDetails> findByCityName(String cityName);
}
