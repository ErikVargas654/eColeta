package Insert;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.UUID;
import utils.bd_connect;

public class InsertBD {

    String sql = ConexaoBanco.getConexao().prepareStatement(sql));
    
    try(
    
        bd_connect.prepareStatement(sql));
                
    ){
    
        ps.set(1, UUID.randomUUID());
        ps.setInt(2, 123);
        ps.setDouble(3, 3.1416);
        ps.execute(); // The insert is executed here
        
    }catch(SQLException e) {
    // Your exception handling code
}
    
}
