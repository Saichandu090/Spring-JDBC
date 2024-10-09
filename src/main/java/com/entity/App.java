package com.entity;

import com.springjdbcdao.StudentDao;
import com.springjdbcdao.StudentDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class App
{
    public static void main(String[] args) {

        System.out.println("Execution started!!");

        ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);

        StudentDao s1=context.getBean("studentDao", StudentDaoImpl.class);
         //Student s2=s1.getStudent("20781A0254");
        List<Student> s2=s1.getStudent();
        s2.forEach(System.out::println);
//        Student stud1=context.getBean("stud1",Student.class);
//        s1.update(stud1);

        System.out.println("Execution Ended!!");
    }
}






//JdbcTemplate a=context.getBean("jdbcTemplate",JdbcTemplate.class);
//
//        String query="Update jdbcspring.student set city='Bangalore' where name='Sai Chandu';";
//        int rs=a.update(query);
//
////        String query="delete from jdbcspring.student where usn='20781A0234';";
////        int rs=a.update(query);
////        String query="insert into jdbcspring.student values(?,?,?);";
////        int rs=a.update(query,"20781A0234","Vamsi","Yadiki");
//        System.out.println(rs+" data Updated!!");