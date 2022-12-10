create table schools
(
    id          bigint auto_increment,
    school_name varchar(255),
    city        varchar(255),
    constraint pk_school primary key (id)
);

create table students
(
    id           bigint auto_increment,
    student_name varchar(255),
    student_year bigint,
    school_id    bigint,
    primary key (id),
    Constraint fk_school_student FOREIGN KEY (school_id)
        REFERENCES schools (id)
);