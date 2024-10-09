package inventorydb.entity;

import inventorydb.dao.InventoryDao;
import inventorydb.dao.InventoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class InventoryConfig
{

    @Bean
    public DataSource getDataSource()
    {
        DriverManagerDataSource ds=new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/inventory_db");
        ds.setUsername("root");
        ds.setPassword("Saichandu@090");
        return ds;
    }

    @Bean
    public JdbcTemplate getJdbcTemplate()
    {
        JdbcTemplate jdbcTemplate=new JdbcTemplate();
        jdbcTemplate.setDataSource(getDataSource());
        return jdbcTemplate;
    }

    @Bean("getInventoryDao")
    public InventoryDao getInventoryDao()
    {
        InventoryImpl impl=new InventoryImpl();
        impl.setDinga(getJdbcTemplate());
        return impl;
    }

    @Bean
    public Inventory getInventory()
    {
        Inventory inventory=new Inventory();
        inventory.setProductid(4);
        inventory.setName("Pencil");
        inventory.setPrice(10);
        inventory.setQuantity(122);
        return inventory;
    }
}
