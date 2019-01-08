import { Component, OnInit } from '@angular/core';
import { RestapiService } from '../shared/restapi.service';
import { Job } from '../addjob/model/job';
import { Router } from '@angular/router';

@Component({
  selector: 'app-joblist',
  templateUrl: './joblist.component.html',
  styleUrls: ['./joblist.component.css']
})
export class JoblistComponent implements OnInit {

    title = 'All Job';


    jobedit: Job;
    joblist: Job[] = [];
    private page = 0 ;
    currentpage: number;
     pages: Array<number>;
  constructor(private api: RestapiService, private route: Router) {
  }

  ngOnInit() {
      this.getAll();
  }

  setPage(i, event: any) {
      event.preventDefault();
      this.page = i;
      this.getAll();

  }
  public getAll() {
    this.api.getAllJob(this.page).subscribe(

        res => {
            this.joblist  = res['content'];
            this.pages = new Array(res['totalPages']);
          //  alert('from the resoftotalPages' + res['totalPages']);
           // alert('store of pages array ' + this.pages.length);
            this.currentpage = res['pageable']['pageNumber'];
           // alert('currentpages   ' + this.currentpage);
            console.log('HI');
        },
        err => {
             alert('Can\'t make request');
        }



    );
  }

  editJob(j: Job) {
this.api.setJob(j);
this.route.navigateByUrl('edit-job');

  }

}
