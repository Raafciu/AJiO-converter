import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {User} from "../model/user";
import {API, DELETE_USER, SAVE_USER, USERS} from "../apiPaths";

@Injectable()
export class UserService {

  constructor(private http: HttpClient) {
  }

  public findAll(): Observable<User[]> {
    return this.http.get<User[]>(API + USERS);
  }

  public save(user: User) {
    return this.http.post<User>(API + SAVE_USER, user);
  }

  public delete(user: User) {
    return this.http.post<User>(API + DELETE_USER, user);
  }
}
