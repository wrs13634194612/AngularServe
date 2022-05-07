package com.example.studentserve.entity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;


/**
 * 1.先做学生信息表  student_message
 * Id
 * 学生的学号 student_id
 * 学生的姓名  student_name
 * 学生的性别  student_sex
 * 学生的所属班级 student_class
 * 学生的就读学校  student_school
 * 学生的班主任  student_teacher
 * 学生信息查询权限  0 ：表示不能查询  1：表示可以查询  student_status
 * unique=true是指这个字段的值在这张表里不能重复，所有记录值都要唯一，就像主键那样;
 * nullable=false是这个字段在保存时必需有值，不能还是null值就调用save去保存入库
 */

@Entity
@Table(name = "student_message")
public class StudentMessageBean implements Serializable {

    @Id
    @Column(nullable = true, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message = "student_id")
    @Column(nullable = true, unique = true)
    private String studentId;

    @NotEmpty(message = "student_name")
    @Column(nullable = true, unique = false)
    private String studentName;


    @NotEmpty(message = "student_sex")
    @Column(nullable = true, unique = false)
    private String studentSex;

    @NotEmpty(message = "student_class")
    @Column(nullable = true, unique = false)
    private String studentClass;


    @NotEmpty(message = "student_school")
    @Column(nullable = true, unique = false)
    private String studentSchool;


    @NotEmpty(message = "student_teacher")
    @Column(nullable = true, unique = false)
    private String studentTeacher;


    @NotEmpty(message = "student_teacher")
    @Column(nullable = true, unique = false)
    private int studentStatus;
}
