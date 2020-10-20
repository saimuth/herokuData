package com.heroku.HerokuData.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.heroku.HerokuData.model.Category;
//@Repository
public interface HerokuDataRepository extends CrudRepository<Category, String>{
	
	@Query("FROM Category")
	public List<Category> getAll(); 

}
