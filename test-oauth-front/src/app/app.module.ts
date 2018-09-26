import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import {AccountsComponent, DialogDataExampleDialog} from './components/accounts/accounts.component';
import { CurrentUserComponent } from './components/current-user/current-user.component';
import { HttpClientModule, HTTP_INTERCEPTORS  }    from '@angular/common/http';
import { RouterModule, Routes } from '@angular/router';
import { CookieService } from 'angular2-cookie/services/cookies.service';
import { AdminComponent } from './components/admin/admin.component';
import { MaterialModule } from './modules/material.module';
import { PaymentComponent } from './components/payment/payment.component';
import { MainMenuComponent } from './components/main-menu/main-menu.component';
import { PaymentCreditorListComponent } from './components/payment/payment-creditor-list/payment-creditor-list.component';
import { PaymentDebtorAccountsComponent } from './components/payment/payment-debtor-accounts/payment-debtor-accounts.component';
import {DialogDataExampleDialog2, PaymentFormComponent} from './components/payment/payment-form/payment-form.component';
import {FormsModule} from '@angular/forms';
import {ReactiveFormsModule} from '@angular/forms';


const appRoutes: Routes = [
  { path: '', redirectTo: '/accounts', pathMatch: 'full' },
  { path: 'payment', component: PaymentComponent },
  { path: 'accounts', component: AccountsComponent },
];

@NgModule({
  declarations: [
    AppComponent,
    AccountsComponent,
    CurrentUserComponent,
    AdminComponent,
    DialogDataExampleDialog,
    DialogDataExampleDialog2,
    PaymentComponent,
    MainMenuComponent,
    PaymentCreditorListComponent,
    PaymentDebtorAccountsComponent,
    PaymentFormComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot(appRoutes, { enableTracing: true }),
    MaterialModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [
    CookieService
  //  { provide: HTTP_INTERCEPTORS, useClass: MyInterceptor, multi: true }
  ],
  entryComponents: [DialogDataExampleDialog, DialogDataExampleDialog2],
  bootstrap: [AppComponent]
})
export class AppModule { }
