import { Injectable } from '@angular/core';
import { HttpClient,HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from '../model/user.model';



@Injectable({
  providedIn: 'root'
})
export class AuthorizeServiceService {

  constructor(private http: HttpClient) {}
   


   getToken(loginPayload): Observable<any>
   {
  return this.http.post<User>('http://localhost:8080/token', loginPayload);
}
}
