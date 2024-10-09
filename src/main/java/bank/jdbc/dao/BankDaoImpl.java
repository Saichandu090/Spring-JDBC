package bank.jdbc.dao;

import bank.jdbc.entity.Bank;
import org.springframework.jdbc.core.JdbcTemplate;

public class BankDaoImpl implements BankDao
{

    private JdbcTemplate dinga;
    @Override
    public void insert(Bank bank)
    {
        String query="Insert into bank values(?,?,?,?);";
        int rs=dinga.update(query,bank.getAccountno(),bank.getName(),bank.getAge(),bank.getBalance());
        if(rs!=0) {
            System.out.println(rs + " data inserted!!");
        }
        else
            System.out.println("Data not inserted!!");
    }

    @Override
    public void update(Bank bank)
    {
        String query="Update bank set name=?,age=?,balance=? where accountno=?;";
        int rs=dinga.update(query,bank.getName(),bank.getAge(),bank.getBalance(),bank.getAccountno());
        if(rs!=0) {
            System.out.println(rs + " data updated!!");
        }
        else
            System.out.println("Data not updated!!");
    }

    @Override
    public void delete(Bank bank)
    {
        String query="Delete from bank where accountno=?;";
        int rs=dinga.update(query,bank.getAccountno());
        if(rs!=0) {
            System.out.println(rs + " data deleted!!");
        }
        else
            System.out.println("Data not deleted!!");
    }

    public JdbcTemplate getDinga() {
        return dinga;
    }

    public void setDinga(JdbcTemplate dinga) {
        this.dinga = dinga;
    }
}
