package com.agsft.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class Skills {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(unique = true, nullable = false)
	private String name;

	/*@ManyToMany
	private List<Employee> employee;
	*/
	@ManyToMany
	@JoinTable(
	  name = "employee_skills", 
	  joinColumns = @JoinColumn(name = "skill_id"), 
	  inverseJoinColumns = @JoinColumn(name = "emp_id"))
	List<Employee> employee;
	
	

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

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}



	@Override
	public String toString() {
		return "Skills [id=" + id + ", name=" + name + ", employee=" + employee + "]";
	}
	
	
}
