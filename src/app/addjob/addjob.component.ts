import { Component, OnInit } from '@angular/core';
import { RestapiService } from '../shared/restapi.service';
import { Job } from './model/job';
import { JobModel } from './model/jobmodel';

@Component({
  selector: 'app-addjob',
  templateUrl: './addjob.component.html',
  styleUrls: ['./addjob.component.css']
})
export class AddjobComponent implements OnInit {

    title = 'Create Job';
    message = '';
    status = false;
 job: JobModel = {
     jobId: 0,
     jobName : '',
     jobDescription : '',

 };
  constructor(private api: RestapiService) { }

  ngOnInit() {
  }

  public postJob() {
      alert('aaaa');
      alert(this.job.jobName);
    alert(this.job.jobDescription);
this.api.addJob(this.job).subscribe(
res => {
    this.status = true;
this.job.jobName = '' ;
this.job.jobDescription = '';
this.message = 'Job Added Successfully';
},
err => {
alert('Can\'t Create job');
this.message = 'Failed to add new job. Plz try agian...';

}

);

  }


}



