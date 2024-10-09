package com.springjdbcdao;

import com.entity.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class StudentDaoImpl implements StudentDao
{
    private JdbcTemplate dinga;

    public JdbcTemplate getDinga()
    {
        return dinga;
    }

    public void setDinga(JdbcTemplate dinga)
    {
        this.dinga = dinga;
    }

    @Override
    public List<Student> getStudent()
    {
        String sql="Select * from student";
        RowMapper<Student> rowMapper=new RowMapperImpl();
        List<Student> students=this.dinga.query(sql,rowMapper);
        return students;
    }

//    @Override
//    public Student getStudent(String usn)
//    {
//        String sql="Select * from student where usn=?";
//        RowMapper r=new RowMapperImpl();
//        Student student= (Student)this.dinga.queryForObject(sql,r,usn);
//        return student;
//    }
//    @Override
//    public int insert(Student student)
//    {
//        String query="Insert into student values(?,?,?);";
//        int rs=dinga.update(query,student.getUsn(),student.getName(),student.getCity());
//        System.out.println(rs+" record inserted!!");
//        return rs;
//    }
//
//    @Override
//    public int update(Student student)
//    {
//        String query="Update student set name=?,city=? where usn=?;";
//        int rs=dinga.update(query,student.getName(),student.getCity(),student.getUsn());
//        System.out.println(rs+" data updated!!");
//        return rs;
//    }
//
//    @Override
//    public int delete(Student student)
//    {
//        String query="Delete from student where usn=?;";
//        int rs=dinga.update(query,student.getUsn());
//        System.out.println(rs+" data deleted!!");
//        return rs;
//    }
}
