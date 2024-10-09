package com.manytomany;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Employee {

	@Id
	@Column(name = "employee_id")
	private int employeeId;

	@Column(name = "emp_name")
	private String employeeName;

	@ManyToMany
	@JoinTable(name = "emp_learn", joinColumns = { @JoinColumn(name = "e_id") }, inverseJoinColumns = {
			@JoinColumn(name = "p_id") })
	private List<Project> projects;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public Employee(int employeeId, String employeeName, List<Project> projects) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.projects = projects;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", projects=" + projects + "]";
	}

}
