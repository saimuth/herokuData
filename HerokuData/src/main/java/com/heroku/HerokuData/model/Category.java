package com.heroku.HerokuData.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="category")
@Getter
@Setter
@ToString
public class Category {
@Id
private int Category_Id;
private String Category_Name;
private String Status;
public int getCategory_Id() {
	return Category_Id;
}
public void setCategory_Id(int category_Id) {
	Category_Id = category_Id;
}
public String getCategory_Name() {
	return Category_Name;
}
public void setCategory_Name(String category_Name) {
	Category_Name = category_Name;
}
public String getStatus() {
	return Status;
}
public void setStatus(String status) {
	Status = status;
}
@Override
public String toString() {
	return "Category [Category_Id=" + Category_Id + ", Category_Name=" + Category_Name + ", Status=" + Status + "]";
}


	
}
