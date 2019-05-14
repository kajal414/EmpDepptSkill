package com.agsft.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Department {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	
	@Column(unique=true,nullable=false)
	private String name;
	
	@OneToMany
	private List<Employee> employee;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employee> getEmpList() {
		return employee;
	}

	public void setEmpList(List<Employee> empList) {
		this.employee = empList;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", employee=" + employee + "]";
	}

	
	
	
}

