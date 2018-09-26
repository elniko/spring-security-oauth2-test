import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PaymentDebtorAccountsComponent } from './payment-debtor-accounts.component';

describe('PaymentDebtorAccountsComponent', () => {
  let component: PaymentDebtorAccountsComponent;
  let fixture: ComponentFixture<PaymentDebtorAccountsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PaymentDebtorAccountsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PaymentDebtorAccountsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
