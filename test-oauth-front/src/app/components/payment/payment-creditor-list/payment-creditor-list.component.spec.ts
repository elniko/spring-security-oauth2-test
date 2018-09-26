import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PaymentCreditorListComponent } from './payment-creditor-list.component';

describe('PaymentCreditorListComponent', () => {
  let component: PaymentCreditorListComponent;
  let fixture: ComponentFixture<PaymentCreditorListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PaymentCreditorListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PaymentCreditorListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
