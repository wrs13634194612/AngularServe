package com.example.studentserve.entity;


        import javax.persistence.*;
        import javax.validation.constraints.Email;
        import javax.validation.constraints.NotEmpty;
        import javax.validation.constraints.NotNull;
        import javax.validation.constraints.Size;
        import java.io.Serializable;
        import java.util.Date;


/**
 2.学生成绩表  student_grade
 Id
 学生的学号  student_id
 学生的姓名  student_name
 学生的语文成绩  language_score
 学生的数学成绩    math_score
 学生的英语成绩      english_score
 学生成绩查询权限  0 ：表示不能查询  1：表示可以查询
 * unique=true是指这个字段的值在这张表里不能重复，所有记录值都要唯一，就像主键那样;
 * nullable=false是这个字段在保存时必需有值，不能还是null值就调用save去保存入库
 */

@Entity
@Table(name = "student_grade")
public class StudentGradeBean implements Serializable {

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


    @NotEmpty(message = "language_score")
    @Column(nullable = true, unique = false)
    private String languageScore;

    @NotEmpty(message = "math_score")
    @Column(nullable = true, unique = false)
    private String mathScore;

    @NotEmpty(message = "english_score")
    @Column(nullable = true, unique = false)
    private String englishScore;
}
