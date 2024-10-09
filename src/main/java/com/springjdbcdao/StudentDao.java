package com.springjdbcdao;

import com.entity.Student;

import java.util.List;

public interface StudentDao
{
//    public int insert(Student student);
//
//    public int update(Student student);
//
//    public int delete(Student student);

//    public Student getStudent(String usn);

    public List<Student> getStudent();
}
