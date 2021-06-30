package com.village.SpringVillageApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.village.SpringVillageApplication.model.VillageDetails;
import com.village.SpringVillageApplication.service.VillageService;

@RestController
@RequestMapping("/village")
public class VillageController {

	@Autowired
	private VillageService villageService;
	
	@PostMapping("/add")
	public VillageDetails createVillage(@RequestBody VillageDetails village) {
		return this.villageService.createVillage(village);
	}
	
	@GetMapping("/display")
	public List<VillageDetails> displayVillage(){
		return this.villageService.displayVillage();
	}
}
