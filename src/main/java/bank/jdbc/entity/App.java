package bank.jdbc.entity;

import bank.jdbc.dao.BankDao;
import bank.jdbc.dao.BankDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class App
{
    public static void main(String[] args) {

        System.out.println("Application started!!");

        ApplicationContext context=new ClassPathXmlApplicationContext("bank.xml");
        BankDao bankDao=context.getBean("bankDao", BankDaoImpl.class);
        Bank bank1=context.getBean("bank1", Bank.class);
        bankDao.delete(bank1);

        System.out.println("Application ended!!");
    }
}
