package com.village.SpringVillageApplication.service;

import java.util.List;

import com.village.SpringVillageApplication.model.CityDetails;

public interface CityService {

	CityDetails createCity(CityDetails city);

	List<CityDetails> displayCity();

	List<CityDetails> displayByCityName(String cityName);

}
