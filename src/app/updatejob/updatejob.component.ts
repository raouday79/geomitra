import { Component, OnInit } from '@angular/core';
import { Job } from '../addjob/model/job';
import { RestapiService } from '../shared/restapi.service';
import { JobModel } from '../addjob/model/jobmodel';

@Component({
  selector: 'app-updatejob',
  templateUrl: './updatejob.component.html',
  styleUrls: ['./updatejob.component.css']
})
export class UpdatejobComponent implements OnInit {


     title = 'EDIT JOB';
    message = '';
    status = false;
  job: Job ;
  jobModel: JobModel = {
      jobId : 0 ,
      jobName : '',
      jobDescription : ''
};
  constructor(private api: RestapiService ) {
       this.job = this.api.getJob();
      this.jobModel.jobId = this.job.jobId;
      this.jobModel.jobName =  this.job.jobName;
      this.jobModel.jobDescription = this.job.jobDescription;
   }

  ngOnInit() {
     // this.getJobById();
  }

  /*
  public getJobById() {
      alert('aaaa');
      alert(this.job.job_name);
    alert(this.job.job_description);

    */

    updateJob() {
this.api.updateJob(this.jobModel).subscribe(
res => {
    this.status = true;
this.jobModel.jobName = res.jobName ;
this.jobModel.jobDescription = res.jobDescription;
this.message = 'Job Updated Successfully';
},
err => {
alert('Can\'t find job');
this.message = 'Failed to update job. Plz try agian...';

}

);

  }


}
