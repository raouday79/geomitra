package com.amc.main;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.amc.main.entity.JobEntity;
import com.amc.main.repository.JobRepository;

//@Controller

public class MainController {
	
	//@Autowired(required=true)
	@Qualifier("jobDao")
	JobRepository jobDao;
	

	
	
	@RequestMapping("blank-page.html")
	public String bags()
	{
		return "blank-page";
	}
	
	@RequestMapping("charts.html")
	public String calender()
	{
		return "charts";
	}
	
	@RequestMapping("compose.html")
	public String catelog()
	{
		return "compose";
	}
	
	@RequestMapping("forms.html")
	public String checkout()
	{
		return "forms";
	}
	
	@RequestMapping("general.html")
	public String details()
	{
		return "grids";
	}
	
	@RequestMapping("inbox.html")
	public String faq()
	{
		return "index";
	}
	
	@RequestMapping("login.html")
	public String index()
	{
		return "login";
	}
	
	@RequestMapping("media.html")
	public String input()
	{
		return "media";
	}
	
	@RequestMapping("signup.html")
	public String products()
	{
		return "signup";
	}
	
	@RequestMapping("tables.html")
	public String register()
	{
		return "tables";
	}
	
	
	
	
	
	@RequestMapping("typography.html")
	public String shoes()
	{
		return "typography";
	}
	
	@RequestMapping("validation.html")
	public String sunglasses()
	{
		return "validation";
	
	}
	
	@RequestMapping("widgets.html")
	public String sweater()
	{
		return "widgets";
	}
	
	
	/// This will return JobEntry Page to create a new Job
		@RequestMapping("NewJob")
		public String newJob()
		{
				return "JobEntry";
		}
	
	
	@RequestMapping("JobRegister")
	public ModelAndView jobRegister(JobEntity entity, HttpSession httpSession)
	{
		System.out.println("Hi");
		
		
		
		System.out.println(entity.getJobName());
		System.out.println(entity.getJobDescription());
		JobEntity entity2 = jobDao.save(entity);
		
		ModelAndView andView = new ModelAndView("JobEntry");
		if(entity2!=null)
		{
			httpSession.setAttribute("message", "Job Created Successfully!!!");
			
			
			return andView;
		}
		else
		{
			httpSession.setAttribute("message", "Failed. Please try Again..");
			return andView;
			
			
		}
		
		
	}
	
	
	
	// This request return the page of list of all jobsopen
	@RequestMapping("AllJobs")
	public ModelAndView showOpenJobList(HttpServletRequest request, @RequestParam(value="viewpg",required=false) String s)
	{
		final int MAX_SIZE = 10;
		
		int i=0;
		if(s!=null)
		{
			i = Integer.parseInt(s);
		}
	
		List<JobEntity> list = jobDao.findAll(PageRequest.of(i, MAX_SIZE)).getContent();
		 
		ModelAndView modelAndView = new ModelAndView("JobList");
		modelAndView.addObject("job_list", list);   
		
		return modelAndView;
		
	}
	
	@RequestMapping("JobUpdate")
	public ModelAndView jobById(@RequestParam(name="jid") String jid)
	{
		System.out.println(jid);
		int id = Integer.parseInt(jid);
	JobEntity jobEntity	=	jobDao.findById(id).orElse( null);
	ModelAndView view = new ModelAndView("JobEdit");
	view.addObject("job_value", jobEntity);
	
	return view;
	
	
	}
	
	@RequestMapping("UpdateJob")
	public ModelAndView updateJob(JobEntity jobEntity, HttpSession httpSession)
	{
		ModelAndView andView = new ModelAndView("JobEdit");
		JobEntity entity = jobDao.save(jobEntity);
		
		if(entity!=null)
		{
			
			httpSession.setAttribute("message", "Job Updated Successfully!!!");
			
			andView.addObject("job_value", jobEntity);
			return andView;
			
		}
		else
		{
			httpSession.setAttribute("message", "Failed While Updating the Job.Please try Again....");
			andView.addObject("job_value", jobEntity);
			return andView;
		}
		
		
		
		
	}
	
	
	

}
