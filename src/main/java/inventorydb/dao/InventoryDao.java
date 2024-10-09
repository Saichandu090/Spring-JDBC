package inventorydb.dao;

import inventorydb.entity.Inventory;

import java.util.List;

public interface InventoryDao
{
    public void insert(Inventory inventory);

    public void update(Inventory inventory);

    public void delete(Inventory inventory);

    public Inventory getInventory(int productid);

    public List<Inventory> getInventoryList();
}
