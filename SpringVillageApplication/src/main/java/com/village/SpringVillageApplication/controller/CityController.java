package com.village.SpringVillageApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.village.SpringVillageApplication.model.CityDetails;
import com.village.SpringVillageApplication.service.CityService;

@RestController
@RequestMapping("/city")
@CrossOrigin(origins = "http://localhost:4200")
public class CityController {

	@Autowired
	private CityService cityService;
	
	@PostMapping("/add")
	public CityDetails createCity(@RequestBody CityDetails city) {
		return this.cityService.createCity(city);
	}
	
	@GetMapping("/display")
	public List<CityDetails> displayCity(){
		return this.cityService.displayCity();
	}
	
	@GetMapping("/display/{cityName}")
	public List<CityDetails> displayByCityName(@PathVariable String cityName) {
		return this.cityService.displayByCityName(cityName);
	}
}
