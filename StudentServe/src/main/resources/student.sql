create table s_admin(
    id int(5) not null,
    username varchar(32) not null,
    password varchar(32) not null,
    status int(1) not null,
    primary key (id,username)
)engine = InnoDB charset = utf8;

create table s_student
(
    id       int(5)      not null,
    sn varchar(32) not null,
    username varchar(32) not null,
    password varchar(32) not null,
    clazz_id int(5) not null,
    sex varchar(5) not null,
    mobile varchar(12) default null,
    qq varchar(18) default null,
    photo varchar(255) default null,
    primary key (id, sn)
) engine = InnoDB
  charset = utf8;


create table s_clazz
(
    id       int(5)      not null,
    name varchar(32) not null,
    info varchar(128) default null,
    primary key (id)
) engine = InnoDB
  charset = utf8;


create table s_course
(
    id       int(5)      not null,
    name varchar(32) not null,
    teacher_id int(5) not null,
    course_date varchar(32) default null,
    selected_num int(5) not null,
    max_num varchar(5) not null,
    info varchar(128) default null,
    primary key (id)
) engine = InnoDB
  charset = utf8;


create table s_leave
(
    id       int(5)      not null,
    student_id int(5) not null,
    info varchar(512) default null,
    status tinyint(1) not null,
    remark varchar(512) default null,
    primary key (id)
) engine = InnoDB
  charset = utf8;



create table s_score
(
    id       int(5)      not null,
    student_id int(5) not null,
    course_id int(5) not null,
    score double(5,2) not null,
    remark varchar(128) default null,
    primary key (id)
) engine = InnoDB
  charset = utf8;


create table s_selected_course
(
    id       int(5)      not null,
    student_id int(5) not null,
    course_id int(5) not null,
    primary key (id)
) engine = InnoDB
  charset = utf8;

create table s_selected_course
(
    id       int(5)      not null,
    student_id int(5) not null,
    course_id int(5) not null,
    primary key (id)
) engine = InnoDB
  charset = utf8;

create table s_attendance
(
    id       int(5)      not null,
    course_id int(5) not null,
    student_id int(5) not null,
    type varchar(11) not null,
    date varchar(11) not null,
    primary key (id)
) engine = InnoDB
  charset = utf8;