package com.village.SpringVillageApplication.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
public class CityDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cityId;
	
	@Column(name="city_name")
	private String cityName;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "city_village", joinColumns = { @JoinColumn(name = "city_id") }, inverseJoinColumns = {
			@JoinColumn(name = "village_id") })
	
	private List<VillageDetails> villages;

	public List<VillageDetails> getVillage() {
		return villages;
	}

	public void setVillage(List<VillageDetails> village) {
		this.villages = village;
	}

	public CityDetails() {
		super();
	}

	public CityDetails(String cityName) {
		super();
		this.cityName = cityName;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

}
