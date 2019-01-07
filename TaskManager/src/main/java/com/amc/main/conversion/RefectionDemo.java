package com.amc.main.conversion;

public class RefectionDemo {

	public static void main(String[] args) {
	JobFrom jobFrom = new JobFrom();
	jobFrom.setEmp(1);
	jobFrom.setJobId(2);
	jobFrom.setJobName("firstJob");
	jobFrom.setJobDescription("first Description");
	
	
	
	FieldCopyUtil.setFields(jobFrom, new JobTo());
	
	}

}
