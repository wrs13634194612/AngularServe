import {HttpClient, HttpHeaders, HttpClientModule} from '@angular/common/http';
import {Injectable} from '@angular/core';
import {Observable, catchError, throwError, map, tap} from 'rxjs';
import {UserBean} from "../interfaces/api.model";

@Injectable({
  providedIn: 'root',
})
export class ApiService {
  private httpHeaders = new HttpHeaders({ 'Content-Type': 'application/json' });

  constructor(private http: HttpClient) {
  }

  postUserData(data: any) {
    console.log('Data', data);
    // Here we are passing the endpoints from gorest api to post data
    return this.http.post<any>('https://gorest.co.in/public/v2/users', data);
  }

  getUserData() {
    // Here we are passing the endpoints from gorest api to get all data
    return this.http.get<any>('https://gorest.co.in/public/v2/users');
  }

  getUserId(id: number): Observable<any> {
    return this.http.get("http://192.168.101.227:5000/test/query?id=" + id).pipe(
      catchError((e) => {
        console.log(e.error.error)
        return throwError(e);
      })
    );
  }

  getAllList(): Observable<any> {
    return this.http.get("http://192.168.101.227:5000/test/query/all").pipe(
      catchError((e) => {
        console.log(e.error.error)
        return throwError(e);
      })
    );
  }


  deleteAllList(id: number): Observable<UserBean> {
    return this.http
      .delete<UserBean>("http://192.168.101.227:5000/test/delete?id="+id)
      .pipe(
        catchError((e) => {
          return throwError(e);
        })
      );
  }


  /*  addAllList(): Observable<any> {
      let url = "http://127.0.0.1:8080/doLogin";
      this.http.post(url, {"id": 22, "email": "1452478563@qq.com", "last_name": "苹果"}).pipe(
        catchError((e) => {
          console.log(e.error.error)
          return throwError(e);
        })
        map()
      )
        .subscribe((response) => {
          console.log(response)
        })

    }*/


  // http://192.168.101.227:5000/test/add?id=103&email=5484075190@qq.com&last_name=刘备

  addAllList(id: number, email: string, lastName: string): Observable<UserBean> {
    let formData = new FormData();
    formData.append('id', id.toString());
    formData.append('email', email);
    formData.append('last_name', lastName);
    return this.http.post("http://192.168.101.227:5000/test/add", formData).pipe(
      map((response: any) => response as UserBean),
      catchError((e) => {
        console.log(e.error);
        return throwError(e);
      })
    );
  }

}
