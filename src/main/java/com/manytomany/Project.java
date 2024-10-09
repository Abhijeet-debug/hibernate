package com.manytomany;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Project {

	@Id
	@Column(name = "project_id")
	private int projectId;

	@Column(name = "project_name")
	private String projectName;

	@ManyToMany(mappedBy = "projects")
	private List<Employee> employess;

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public List<Employee> getEmployess() {
		return employess;
	}

	public void setEmployess(List<Employee> employess) {
		this.employess = employess;
	}

	public Project(int projectId, String projectName, List<Employee> employess) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.employess = employess;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", employess=" + employess + "]";
	}

}
