import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {HttpClientModule} from "@angular/common/http";
import {UserListComponent} from "./components/user-list/user-list.component";
import {UserFormComponent} from "./components/user-form/user-form.component";
import {FormsModule} from "@angular/forms";
import {UserService} from "./service/user.service";
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {MatIconModule} from "@angular/material/icon";
import {MatSnackBarModule} from "@angular/material/snack-bar";

@NgModule({
  declarations: [
    AppComponent,
    UserListComponent,
    UserFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    BrowserAnimationsModule,
    MatIconModule,
    MatSnackBarModule
  ],
  providers: [UserService],
  bootstrap: [AppComponent]
})
export class AppModule {
}
