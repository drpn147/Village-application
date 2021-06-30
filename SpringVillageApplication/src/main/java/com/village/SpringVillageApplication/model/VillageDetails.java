package com.village.SpringVillageApplication.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class VillageDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int villageId;
	@Column(name = "village_name")
	private String villageName;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "villages")
	private List<CityDetails> cities;

	public int getVillageId() {
		return villageId;
	}

	public void setVillageId(int villageId) {
		this.villageId = villageId;
	}

	public String getVillageName() {
		return villageName;
	}

	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}

	public VillageDetails(String villageName) {
		super();
		this.villageName = villageName;
	}

	public VillageDetails() {
		super();
	}

	public List<CityDetails> getCities() {
		return cities;
	}

	public void setCities(List<CityDetails> cities) {
		this.cities = cities;
	}

}
