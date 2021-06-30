package com.village.SpringVillageApplication.service;

import java.util.List;

import com.village.SpringVillageApplication.model.VillageDetails;

public interface VillageService {

	VillageDetails createVillage(VillageDetails village);

	List<VillageDetails> displayVillage();

}
