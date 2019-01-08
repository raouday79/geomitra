package com.amc.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amc.main.dto.EmployeeAssignedJobDto;
import com.amc.main.dto.EmployeeDto;
import com.amc.main.dto.JobAssignDto;
import com.amc.main.dto.JobDto;
import com.amc.main.dto.JobRecordDto;
import com.amc.main.dto.WorkingDto;
import com.amc.main.entity.EmployeeEntity;
import com.amc.main.entity.JobAssignEntity;
import com.amc.main.entity.WorkingEntity;
import com.amc.main.service.EmployeeService;
import com.amc.main.service.JobAssignService;
import com.amc.main.service.WorkingJobService;
import com.amc.main.utility.NotFoundException;

@RestController
@RequestMapping(value="/api")
@CrossOrigin
public class RestEmployeeAssignController {
	
	
	@Autowired
	WorkingJobService workingJobService;
	
	@Autowired
	JobAssignService jobAssignService; 

	@Autowired
	EmployeeService employeeService; 
	
	// Add the particular job working details.....
	@PostMapping(value="add-job-hour")
	public ResponseEntity<JobRecordDto> addWorkingHour2(@RequestBody JobRecordDto dto) throws NotFoundException,Exception
	{
		workingJobService.postWorkingDetails2(dto);
		
		return new ResponseEntity<JobRecordDto>(dto,HttpStatus.OK);
	}
	
	
	/// Long method.....not well suited...
	@PostMapping(value="add-working-hour")
	public WorkingDto addWorkingHour(@RequestBody WorkingDto workingDto)
	{
		workingJobService.postWorkingDetails(workingDto);
		
		return workingDto;
	}
	
	/// This method will return the emp assigned jobs.........List...
	@GetMapping(value="employee-job-assign")
	public List<JobDto> getEmployeeSpecificJob(@RequestParam(name="empId") int empId)
	{
		
		List<JobDto> list = jobAssignService.getEmployeeSpecificJobAssign(empId);
		System.out.println("--------------------------------------------------SIZE"+list.size());
		return list;
		
	}
	
	
	@GetMapping(value="all-employee")
	public List<EmployeeDto> getAllEmployee()
	{
		return employeeService.getAllEmployee();
	}
	
	
	@PostMapping(value="add-employee",consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<EmployeeEntity> saveEmployee(@RequestBody	EmployeeEntity employeeEntity)
	{
		
		employeeService.registerEmployee(employeeEntity);
		ResponseEntity<EmployeeEntity> response = new ResponseEntity<>(employeeEntity,HttpStatus.OK);
		return response;
		
		
	}
	
	
	// Assign job to employee..................................................
	
	@PostMapping(value="assign-new-job")
	public JobAssignDto postMethodName(@RequestBody JobAssignDto assignDto) {
		/*System.out.println(assignDto.getJobId());
		System.out.println(assignDto.getEmpId());
		*/
		jobAssignService.newAssignJob(assignDto);
		System.out.println("----------------------------------------------------------0099000");
		
		return assignDto;
	}
	
	@GetMapping(value="list-assign-job")
	public List<JobAssignEntity> getList()
	{
		
	//	List<JobAssignEntity> list = assignDao.findAll();
		List<JobAssignEntity> list = jobAssignService.getAllAssigned();
		
		return list;
	}

	

	// Get job list of employeee.................................................................
	@GetMapping(value="get-assign-job/{emp_id}") 
	public List<EmployeeAssignedJobDto> GetAssignJob(@PathVariable(name="emp_id") int emp_id) throws Exception
	{
		
		List<EmployeeAssignedJobDto> ls = jobAssignService.getAssignedById(emp_id);

		
		return ls;
	}
	
	
	
	@GetMapping(value="work-details/{assign_id}") 
	public List<WorkingEntity> workingentity(@PathVariable(name="assign_id")int assign_id) throws Exception
   {
		List<WorkingEntity> ws = workingJobService.getWorkingByAssignId(assign_id);
		
		return ws;
	
   }
	

	/*@PostMapping(value="record-work")
	public WorkingEntity addWorkRecord(WorkingEntity workingEntity)
	{
		workingJobService.postWorkingDetails(workingEntity);
		return workingEntity;
		
	}*/
	





}
