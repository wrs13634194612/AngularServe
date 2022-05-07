package com.example.studentserve.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_user") // 默认是类名小写
public class User {

    @Id  //    @GeneratedValue(strategy = GenerationType.IDENTITY) // 自增主键
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "last_name", length = 50)
    private String lastName;

    @Column // 不写属性名就是默认字段名
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}