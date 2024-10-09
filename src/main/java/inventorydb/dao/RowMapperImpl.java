package inventorydb.dao;

import inventorydb.entity.Inventory;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperImpl implements RowMapper<Inventory>
{

    @Override
    public Inventory mapRow(ResultSet rs, int rowNum) throws SQLException
    {
        Inventory inventory=new Inventory();
        inventory.setProductid(rs.getInt(1));
        inventory.setName(rs.getString(2));
        inventory.setPrice(rs.getInt(3));
        inventory.setQuantity(rs.getInt(4));
        return inventory;
    }
}
