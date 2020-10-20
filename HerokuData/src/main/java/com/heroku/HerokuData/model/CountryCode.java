package com.heroku.HerokuData.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Country_Code__c")
public class CountryCode {
	
	@Id
	private int Country_ID;
	private String Region;
	private String Country_Code ;
	private String Country_Name;
	private String Status;
	public int getCountry_ID() {
		return Country_ID;
	}
	public void setCountry_ID(int country_ID) {
		Country_ID = country_ID;
	}
	public String getRegion() {
		return Region;
	}
	public void setRegion(String region) {
		Region = region;
	}
	public String getCountry_Code() {
		return Country_Code;
	}
	public void setCountry_Code(String country_Code) {
		Country_Code = country_Code;
	}
	public String getCountry_Name() {
		return Country_Name;
	}
	public void setCountry_Name(String country_Name) {
		Country_Name = country_Name;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
	

}
 