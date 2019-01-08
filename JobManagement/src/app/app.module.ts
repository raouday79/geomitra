import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { NaviagtionComponent } from './naviagtion/naviagtion.component';
import { AddjobComponent } from './addjob/addjob.component';
import { JoblistComponent } from './joblist/joblist.component';
import { LoginComponent } from './login/login.component';
import { NotFoundComponent } from './not-found/not-found.component';
import { Router, Routes, RouterModule} from '@angular/router';
import { UpdatejobComponent } from './updatejob/updatejob.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { EmployeelistComponent } from './employeelist/employeelist.component';
import { EmployeeassignjobComponent } from './employeeassignjob/employeeassignjob.component';
import { EmployeejoblistComponent } from './employeejoblist/employeejoblist.component';
import { WorkingjobComponent } from './workingjob/workingjob.component';


const appRoutes: Routes = [

    {
        path : 'joblist',
        component: JoblistComponent
    },
    {
        path : 'addjob',
        component: AddjobComponent
    },
    {
        path : '',
        component: LoginComponent,
        pathMatch: 'full'
    },
    {
        path : 'edit-job',
        component: UpdatejobComponent
    },
    {
        path : 'employee-list',
        component: EmployeelistComponent
    },
    {
        path : 'employee-job-assign',
        component: EmployeeassignjobComponent
    },
    {
        path : 'employee-jobs',
        component: EmployeejoblistComponent
    },
     {
        path : 'add-job-record',
        component: WorkingjobComponent
    },
     {
        path : '**',
        component: NotFoundComponent
    }


];

@NgModule({
  declarations: [
    AppComponent,
    NaviagtionComponent,
    AddjobComponent,
    JoblistComponent,
    LoginComponent,
    NotFoundComponent,
    UpdatejobComponent,
    EmployeelistComponent,
    EmployeeassignjobComponent,
    EmployeejoblistComponent,
    WorkingjobComponent
  ],
  imports: [
    BrowserModule,
     FormsModule,
    HttpClientModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
