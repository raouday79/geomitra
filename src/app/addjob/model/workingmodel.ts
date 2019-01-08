import { JobAssign } from './jobassign';
import { EmployeeJobModel } from './employeejobmodel';

export interface WorkingModel {
workId: number;
employeeWorking: EmployeeJobModel;
hourSpent: string;
date: string;

}
