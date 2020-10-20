package com.heroku.HerokuData.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.heroku.HerokuData.model.Category;
import com.heroku.HerokuData.model.CountryCode;
//@Repository
public interface HerokuCountryRepository extends CrudRepository<CountryCode, String>{
	
	@Query("FROM CountryCode")
	public List<CountryCode> getAllCountries(); 

}
