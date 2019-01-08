import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { WorkingjobComponent } from './workingjob.component';

describe('WorkingjobComponent', () => {
  let component: WorkingjobComponent;
  let fixture: ComponentFixture<WorkingjobComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ WorkingjobComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(WorkingjobComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
