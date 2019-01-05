package com.amc.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amc.main.dao.EmployeeDao;
import com.amc.main.dao.JobAssignDao;
import com.amc.main.dao.WorkingJobDao;
import com.amc.main.entity.EmployeeEntity;
import com.amc.main.entity.JobAssignEntity;
import com.amc.main.entity.WorkingEntity;

@RestController
@RequestMapping(value="/api")
public class RestEmployeeController {
	
	@Autowired
	EmployeeDao edao; 
	
	@Autowired
	WorkingJobDao workdao;
	
	@Autowired
	JobAssignDao jassdao;
	

	@Autowired
	JobAssignDao assignDao;

	
	@PostMapping(value="add-employee",consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<EmployeeEntity> saveEmployee(@RequestBody	EmployeeEntity employeeEntity)
	{
		
		edao.save(employeeEntity);
		ResponseEntity response = new ResponseEntity<>(employeeEntity,HttpStatus.OK);
		
		return response;
		
		
	}
	
	
	
	@PostMapping(value="assignnewjob")
	public JobAssignEntity postMethodName(@RequestBody JobAssignEntity entity) {
		assignDao.save(entity);
		
		
		return entity;
	}
	
	@GetMapping(value="list-assign-job")
	public List<JobAssignEntity> getList()
	{
		
		List<JobAssignEntity> list = assignDao.findAll();
		return list;
	}
	
	
	
	
	
	

	@GetMapping(value="get-assign-job/{emp_id}")
	
	public List<JobAssignEntity> GetAssignJob(@PathVariable(name="emp_id") int emp_id)
	{
		List<JobAssignEntity> ls= jassdao.findByEmpId(emp_id);
		
		return ls;
	}
	
	@GetMapping(value="work-details/{assign_id}")

   public List<WorkingEntity> workingentity(@PathVariable(name="assign_id")int assign_id)
   {
		List<WorkingEntity> ws=workdao.findByAssignId(assign_id);
      
		return ws;
	
   }





}
