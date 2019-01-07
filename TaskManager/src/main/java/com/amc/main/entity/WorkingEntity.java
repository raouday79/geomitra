package com.amc.main.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="working_detail")
public class WorkingEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="work_id")
	int workId;
	
	
	
	
	@ManyToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinColumn(referencedColumnName="job_assign_id",name="assign_id")
	JobAssignEntity  assignEntity;
	
	@Column(name="assign_id",insertable=false,updatable=false)
	int assignId;
	
	@Column(name="hour_spent")
	String hourSpent;
	
	@Column(name="date")
	String date;

	public int getWorkId() {
		return workId;
	}

	public void setWorkId(int workId) {
		this.workId = workId;
	}

	public JobAssignEntity getAssignEntity() {
		return assignEntity;
	}

	public void setAssignEntity(JobAssignEntity assignEntity) {
		this.assignEntity = assignEntity;
	}

	public int getAssignId() {
		return assignId;
	}

	public void setAssignId(int assignId) {
		this.assignId = assignId;
	}

	public String getHourSpent() {
		return hourSpent;
	}

	public void setHourSpent(String hourSpent) {
		this.hourSpent = hourSpent;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	
	

	
	
	
}
