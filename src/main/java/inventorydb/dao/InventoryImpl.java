package inventorydb.dao;

import inventorydb.entity.Inventory;
import inventorydb.entity.InventoryConfig;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class InventoryImpl implements InventoryDao
{

    private JdbcTemplate dinga;

    @Override
    public void insert(Inventory inventory)
    {
        String query="Insert into inventory values(?,?,?,?)";
        int rs=this.dinga.update(query,inventory.getProductid(),inventory.getName(),inventory.getPrice(),inventory.getQuantity());
        if(rs!=0)
            System.out.println(rs+" data inserted!!");
        else
            System.out.println("No data inserted!!");
    }

    @Override
    public void update(Inventory inventory)
    {
        String query="Update inventory set name=?,price=?,quantity=? where productid=?";
        int rs=this.dinga.update(query,inventory.getName(),inventory.getPrice(),inventory.getQuantity(),inventory.getProductid());
        if(rs!=0)
            System.out.println(rs+" data updated!!");
        else
            System.out.println("No data updated!!");
    }

    @Override
    public void delete(Inventory inventory)
    {
        String query="Delete from inventory where productid=?";
        int rs=this.dinga.update(query,inventory.getProductid());
        if(rs!=0)
            System.out.println(rs+" data deleted!!");
        else
            System.out.println("No data deleted!!");
    }

    @Override
    public Inventory getInventory(int productid)
    {
        String sql="Select * from inventory where productid=?";
        Inventory inventory=this.dinga.queryForObject(sql,new RowMapperImpl(),productid);
        if(inventory==null)
            return null;
        else
            return inventory;
    }

    @Override
    public List<Inventory> getInventoryList()
    {
        String sql="Select * from inventory";
        List<Inventory> list=this.dinga.query(sql,new RowMapperImpl());
        if(list.isEmpty())
            return null;
        else
            return list;
    }

    public JdbcTemplate getDinga()
    {
        return dinga;
    }

    public void setDinga(JdbcTemplate dinga)
    {
        this.dinga = dinga;
    }
}
