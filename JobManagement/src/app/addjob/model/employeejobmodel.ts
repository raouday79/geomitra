import { JobModel } from './jobmodel';
import { JobAssign } from './jobassign';
import { Employee } from './employee';

export interface EmployeeJobModel {
   jobDto: JobModel;
    assignDto: JobAssign;

    employeeDto: Employee;

}
