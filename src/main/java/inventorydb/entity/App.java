package inventorydb.entity;

import inventorydb.dao.InventoryDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App
{
    public static void main(String[] args)
    {
        System.out.println("Start");

        ApplicationContext context=new AnnotationConfigApplicationContext(InventoryConfig.class);
        InventoryDao inventoryDao=context.getBean("getInventoryDao",InventoryDao.class);
        Inventory inventory=context.getBean("getInventory",Inventory.class);
        inventoryDao.delete(inventory);
        //List<Inventory> inventoryList=inventoryDao.getInventoryList();
        //inventoryList.forEach(System.out::println);
        //Inventory inventory1=inventoryDao.getInventory(4);
        //System.out.println(inventory1);
        System.out.println("End");
    }
}
