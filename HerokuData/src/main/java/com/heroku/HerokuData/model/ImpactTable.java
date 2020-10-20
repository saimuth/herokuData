package com.heroku.HerokuData.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="impacttable")
public class ImpactTable {
	@Id
	private int Impact_Table_Id;
	private String Impact_Table_Name;
	public int getImpact_Table_Id() {
		return Impact_Table_Id;
	}
	public void setImpact_Table_Id(int impact_Table_Id) {
		Impact_Table_Id = impact_Table_Id;
	}
	public String getImpact_Table_Name() {
		return Impact_Table_Name;
	}
	public void setImpact_Table_Name(String impact_Table_Name) {
		Impact_Table_Name = impact_Table_Name;
	}
	

}
