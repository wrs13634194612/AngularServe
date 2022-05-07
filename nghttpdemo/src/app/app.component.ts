import {Component, OnInit} from '@angular/core';
import {UserBean} from "../app/interfaces/api.model";
import {ApiService} from '../app/services/cliente.service';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent  implements OnInit {
  title = 'nghttpdemo';

  constructor(private api: ApiService) {

  }
  ngOnInit(): void {
    this.getAllData()
  }

  getAllData() {
    this.api.getUserData().subscribe({
      next: (res) => {
        console.log(res)
      },
      error: (err) => {
        console.log(err)
      }
    })
  }

  getTopBtn() {
    this.api.getUserId(102).subscribe({
      next: (res) => {
        console.log(res.id)
        console.log(res.email)
        console.log(res.lastName)
      },
      error: (e) => {
        console.log(e.error)
      },
    });
  }

  getAllListData() {
    this.api.getAllList().subscribe({
      next: (res) => {
        console.log(res)
        for (let i in res) {
          console.log(res[i].lastName)
        }
      },
      error: (e) => {
        console.log(e.error)
      },
    });
  }

  addListData() {
    this.api.addAllList(106,"899215963@qq.com","北川").subscribe({
      next: (res) => {
        console.log(res)
      },
      error: (e) => {
        console.log(e.error)
      },
    })
  }

  deleteListData(){
    this.api.deleteAllList(106).subscribe({
      next: (res) => {
        console.log('wrs delete')

        console.log(res)
      },
      error: (e) => {
        console.log(e.error)
      },
    })
  }

}
