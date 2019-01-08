import { Component, OnInit } from '@angular/core';
import { JobModel } from '../addjob/model/jobmodel';
import { WorkingModel } from '../addjob/model/workingmodel';
import { RestapiService } from '../shared/restapi.service';
import { JobRecord } from '../addjob/model/jobrecord';

@Component({
  selector: 'app-workingjob',
  templateUrl: './workingjob.component.html',
  styleUrls: ['./workingjob.component.css']
})
export class WorkingjobComponent implements OnInit {


    status= false;
    message = '';
    job: JobModel;
    workingJob: WorkingModel = {
        workId: 0,
        employeeWorking: null,
        date: '',
        hourSpent: ''
    };

    jobrecord: JobRecord = {
        date: '',
        hourSpent: '',
        assignId: 0,
        workId: 0
    };
  constructor(private api: RestapiService) {
    //  this.workingJob.employeeWorking = this.api.getWorkingJob();
    this.jobrecord.assignId = this.api.getAssignId();
   }


  adddWorking() {

    this.api.addWorkingHour2(this.jobrecord).subscribe(
        res => {
            this.jobrecord = res;
            this.status = true;
            this.message = 'Record Added Successfully';

        },
        err => {

            alert('can add working detail....plz try again');
        }
    );
  }

  ngOnInit() {
  }

}
