import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { InputboardComponent } from './inputboard.component';

describe('InputboardComponent', () => {
  let component: InputboardComponent;
  let fixture: ComponentFixture<InputboardComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ InputboardComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(InputboardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
