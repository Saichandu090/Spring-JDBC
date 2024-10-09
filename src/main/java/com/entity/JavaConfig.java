package com.entity;

import com.springjdbcdao.StudentDao;
import com.springjdbcdao.StudentDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class JavaConfig
{
    @Bean("dataSource")
    public DataSource getDataSource()
    {
        DriverManagerDataSource ds=new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/jdbcspring");
        ds.setUsername("root");
        ds.setPassword("Saichandu@090");

        return ds;
    }

    @Bean("jdbcTemplate")
    public JdbcTemplate getJdbcTemplate()
    {
        JdbcTemplate jd=new JdbcTemplate();
        jd.setDataSource(getDataSource());

        return jd;
    }

    @Bean("studentDao")
    public StudentDao getStudent()
    {
        StudentDaoImpl s=new StudentDaoImpl();
        s.setDinga(getJdbcTemplate());
        return s;
    }
}
