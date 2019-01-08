import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployeeassignjobComponent } from './employeeassignjob.component';

describe('EmployeeassignjobComponent', () => {
  let component: EmployeeassignjobComponent;
  let fixture: ComponentFixture<EmployeeassignjobComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EmployeeassignjobComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EmployeeassignjobComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
