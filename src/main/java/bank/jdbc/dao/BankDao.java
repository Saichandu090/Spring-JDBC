package bank.jdbc.dao;

import bank.jdbc.entity.Bank;

public interface BankDao
{
    public void insert(Bank bank);

    public void update(Bank bank);

    public void delete(Bank bank);
}
