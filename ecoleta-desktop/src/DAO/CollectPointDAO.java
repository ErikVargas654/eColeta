package DAO;

import entity.CollectPoint;
import utils.bd_connect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CollectPointDAO {
    
    public static CollectPoint buscarPontoPorNome(String name){
        String sql = "SELECT * FROM Ponto_de_coleta WHERE nome = ?";
        try (PreparedStatement stm = bd_connect.getConexao().prepareStatement(sql)){
            stm.setString(1, name);
            ResultSet rs = stm.executeQuery();
            if(rs.next()){
                String buscar_nome = rs.getString("nome");
            }
        }catch (SQLException e){
            System.out.println("DEU RUIM");
            return null;
        }
        
        return null;
    }

}
