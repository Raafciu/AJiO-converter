import {Component, NgZone, OnInit} from "@angular/core";
import {User} from "../../model/user";
import {UserService} from "../../service/user.service";

@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.scss']
})
export class UserListComponent implements OnInit {

  users: User[];

  constructor(private userService: UserService,
              private ngZone: NgZone) {
  }

  ngOnInit() {
    this.refreshData();
  }

  delete(user: User) {
    this.userService.delete(user).subscribe(result => {
      this.refreshData();
    });
  }

  refreshData() {
    this.userService.findAll().subscribe(data => {
      this.ngZone.run(() => {
        this.users = data;
      });
    });
  }
}
