import { Component, OnInit } from '@angular/core';
import { RestapiService } from '../shared/restapi.service';
import { Employee } from '../addjob/model/employee';
import { EmployeeJobModel } from '../addjob/model/employeejobmodel';
import { Router } from '@angular/router';

@Component({
  selector: 'app-employeejoblist',
  templateUrl: './employeejoblist.component.html',
  styleUrls: ['./employeejoblist.component.css']
})
export class EmployeejoblistComponent implements OnInit {

    emp: Employee;

    title: 'My Jobs';
    employeejobmodel: EmployeeJobModel[] = [];
  constructor(private api: RestapiService, private router: Router) {
      this.emp = this.api.getEmployee();
   }

  ngOnInit() {
      this.getEmployeejob();
  }


  workingDetail(empJob: EmployeeJobModel) {
    //  this.api.setWorkingJob(empJob);

    this.api.setAssignId(empJob.assignDto.jobAssignId);
      this.router.navigateByUrl('add-job-record');

  }
  getEmployeejob() {
this.api.getAllEmployeeAssignJob(this.emp).subscribe(

    res => {
this.employeejobmodel = res;
alert(this.employeejobmodel.length);

    },
    err => {

        alert('can not make employee specific job call');
    }
);
  }

}
