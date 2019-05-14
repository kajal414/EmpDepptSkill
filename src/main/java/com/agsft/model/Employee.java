package com.agsft.model;

import java.util.Date;
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
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Type;

@Entity
@Table
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(nullable =false)
	private String name;
	
	@Column(unique=true, nullable=false)
	private String email;
	
	@Column(columnDefinition = "TINYINT(1)",nullable=false)
	public boolean active = true;
	
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date joining_date;
	
	@Column(nullable=false)
	private double salary;
	
	@ManyToOne
	@JoinColumn(referencedColumnName="id",nullable=false)
	private Department department;
	
	/*@ManyToMany
	private List<Skills> skill;
	*/
	@ManyToMany
	@JoinTable(
	  name = "employee_skills", 
	  joinColumns = @JoinColumn(name = "emp_id"), 
	  inverseJoinColumns = @JoinColumn(name = "skill_id"))
	List<Skills> skill;
	

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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public boolean isActive() {
		return active;
	}


	public void setActive(boolean active) {
		this.active = active;
	}


	public Date getJoining_date() {
		return joining_date;
	}


	public void setJoining_date(Date joining_date) {
		this.joining_date = joining_date;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	public List<Skills> getSkill() {
		return skill;
	}


	public void setSkill(List<Skills> skill) {
		this.skill = skill;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", active=" + active + ", joining_date="
				+ joining_date + ", salary=" + salary + ", department=" + department + ", skill=" + skill + "]";
	}



	
	
	
	
	
	
}
