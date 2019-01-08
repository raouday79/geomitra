import { Component, OnInit } from '@angular/core';
import { RestapiService } from '../shared/restapi.service';
import { Employee } from '../addjob/model/employee';
import { Router } from '@angular/router';

@Component({
  selector: 'app-employeelist',
  templateUrl: './employeelist.component.html',
  styleUrls: ['./employeelist.component.css']
})
export class EmployeelistComponent implements OnInit {

    emplist: Employee[] = [];

    title: 'All Employee';
  constructor(private api: RestapiService, private route: Router) { }


  assignNewJob(emp: Employee) {
      this.api.setEmployee(emp);
      this.route.navigateByUrl('employee-job-assign');
  }

  viewJobs(emp: Employee) {
       this.api.setEmployee(emp);
       this.route.navigateByUrl('employee-jobs');
  }
  ngOnInit() {
      this.getAllEmployee();
  }

  getAllEmployee() {
this.api.allEmployee().subscribe(
    res => {
        this.emplist = res;
    },
    err => {
        alert('Can.t make request');

    }

);

  }
}
