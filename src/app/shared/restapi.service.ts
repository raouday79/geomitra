import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Job } from '../addjob/model/job';
import { Employee } from '../addjob/model/employee';
import { JobModel } from '../addjob/model/jobmodel';
import { JobAssign } from '../addjob/model/jobassign';
import { EmployeeJobModel } from '../addjob/model/employeejobmodel';
import { WorkingModel } from '../addjob/model/workingmodel';
import { JobRecord } from '../addjob/model/jobrecord';


@Injectable({
  providedIn: 'root'
})
export class RestapiService {
private  BASE_URL = 'http://localhost:8080/api';
private  listjoburl = this.BASE_URL + '/pg-jobs';
private updateurl = this.BASE_URL + '/update-job';
private addjoburl = this.BASE_URL + '/jobsave';

private allemployeeurl = this.BASE_URL + '/all-employee';
private employeespecificjoburl = this.BASE_URL + '/employee-job-assign';

private assignempjoburl = this.BASE_URL + '/assign-new-job';

private employeeassignjoburl = this.BASE_URL + '/get-assign-job/';

private addWorkingJobUrl = this.BASE_URL + '/add-working-hour';
private addWorkingJobUrl2 = this.BASE_URL + '/add-job-hour';


private job: Job;
private emp: Employee;

private workJob: EmployeeJobModel;

private empId: number;
private assignId: number;
  constructor(private http: HttpClient) { }


  // This will post the job Working
  addWorkingHour(workingJob: WorkingModel): Observable<WorkingModel> {
      return this.http.post<WorkingModel>(this.addWorkingJobUrl, workingJob);
  }

   addWorkingHour2(job: JobRecord): Observable<JobRecord> {
      return this.http.post<JobRecord>(this.addWorkingJobUrl2, job);
  }
  getAllEmployeeAssignJob(emp: Employee): Observable<EmployeeJobModel[]> {

    return this.http.get<EmployeeJobModel[]>(this.employeeassignjoburl + emp.empId);
  }
getAllJob(page: number): Observable<Job[]> {

   return this.http.get<Job[]>(this.listjoburl + '?pg=' + page);

}

assignJob(jobassign: JobAssign) {

return this.http.post<JobAssign>(this.assignempjoburl, jobassign);
}


employeeSpecificJob( empId: number) {

    return this.http.get<JobModel[]>(this.employeespecificjoburl + '?empId=' + empId);
}


updateJob(job: JobModel): Observable<any> {

   return this.http.put( this.updateurl, job);
}

allEmployee(): Observable<Employee[]> {

    return this.http.get<Employee[]>(this.allemployeeurl);
}

addJob(job: JobModel): Observable<any> {

   return this.http.post( this.addjoburl, job);
}
setJob(j: Job) {
    this.job = j;

}

getJob() {
    return this.job;
}

setEmployee(emp: Employee) {

    this.emp = emp;
}

getEmployee() {
    return this.emp;
}

setEmpId(empId: number) {
this.empId = empId;
}

getEmpId() {
    return this.empId;
}

setWorkingJob(workJob: EmployeeJobModel) {

    this.workJob = workJob;

}

getWorkingJob() {
    return this.workJob;
}

setAssignId(assignId: number)  {
this.assignId = assignId;
}

getAssignId() {
    return this.assignId;
}

}
