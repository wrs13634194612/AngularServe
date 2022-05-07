package com.example.studentserve.entity;


import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;


/**
 * 3.学校班级表  student_school_class
 * Id
 * 学校的班级号 class_id
 * 班级班主任的名称   teacher_name
 * 班级人数   class_num
 * unique=true是指这个字段的值在这张表里不能重复，所有记录值都要唯一，就像主键那样;
 * nullable=false是这个字段在保存时必需有值，不能还是null值就调用save去保存入库
 */

@Entity
@Table(name = "student_school_class")
public class StudentSchoolBean implements Serializable {

    @Id
    @Column(nullable = true, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message = "class_id")
    @Column(nullable = true, unique = true)
    private String classId;

    @NotEmpty(message = "teacher_name")
    @Column(nullable = true, unique = false)
    private String teacherName;

    @NotEmpty(message = "class_num")
    @Column(nullable = true, unique = false)
    private String classNum;

}
