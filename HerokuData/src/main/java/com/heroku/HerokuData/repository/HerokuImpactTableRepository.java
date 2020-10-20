package com.heroku.HerokuData.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.heroku.HerokuData.model.ImpactTable;
@Repository
public interface HerokuImpactTableRepository extends CrudRepository<ImpactTable, String>{
	@Query("FROM ImpactTable")
	public List<ImpactTable> getAllImpactTable(); 
}
