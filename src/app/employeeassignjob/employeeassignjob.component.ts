import { Component, OnInit } from '@angular/core';
import { Job } from '../addjob/model/job';
import { RestapiService } from '../shared/restapi.service';
import { Employee } from '../addjob/model/employee';
import { JobModel } from '../addjob/model/jobmodel';
import { JobAssign } from '../addjob/model/jobassign';

@Component({
  selector: 'app-employeeassignjob',
  templateUrl: './employeeassignjob.component.html',
  styleUrls: ['./employeeassignjob.component.css']
})
export class EmployeeassignjobComponent implements OnInit {

    title = 'Jobs To Assign';
    name = '';
   private  emp: Employee;

   jobAssign: JobAssign = {
       jobAssignId: 0,
       empId: 1,
        jobId: 0,
        start: '',
        end: '',
        totalHours : '0'

   };

   start: '';
   end: '';
    jobedit: JobModel;
    joblist: JobModel[] = [];
  constructor(  private api: RestapiService) {

    this.emp = api.getEmployee();
    this.name = this.emp.empName;
    alert(this.emp.empName);
    this.jobAssign.empId = this.emp.empId;
  }

  ngOnInit() {
      this.getJob();
  }
  getJob() {
this.api.employeeSpecificJob(this.emp.empId).subscribe(

    res => {
        this.joblist = res;
    },
    err => {

        alert('Cant make request');
    }


);
  }

assignJob(job: JobModel) {
    this.jobAssign.jobId = job.jobId;
    this.jobAssign.start = this.start;
    this.jobAssign.end = this.end;
    this.jobAssign.totalHours = '0';
    this.api.assignJob(this.jobAssign).subscribe(
        res => {

             this.getJob();
            // location.reload();
        },
        err => {
            alert('can not assign job...plz try after some time....');

        }

    );

}

}
