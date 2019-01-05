package com.amc.main.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_detail")
public class EmployeeEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="emp_id")
	int empId;
	
	@Column(name="emp_name")
	String empName;
	
	@Column(name="contact")
	String contact;
	
	@Column(name="no_of_job_assign")
	String noOfJobAssigned;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getNoOfJobAssigned() {
		return noOfJobAssigned;
	}

	public void setNoOfJobAssigned(String noOfJobAssigned) {
		this.noOfJobAssigned = noOfJobAssigned;
	}
	
	
	

}
