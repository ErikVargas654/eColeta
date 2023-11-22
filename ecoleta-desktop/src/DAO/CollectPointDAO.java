package DAO;

import entity.CollectPoint;
import java.sql.Connection;
import utils.bd_connect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CollectPointDAO {
    
    private boolean nameExist(String nome) {
        String sql = "SELECT COUNT(*) FROM Ponto_de_coleta WHERE nome = ?";
        try (Connection conexao = bd_connect.getConexao();
             PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
            preparedStatement.setString(1, nome);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    int count = resultSet.getInt(1);
                    return count > 0;
                }
            }

        } catch (SQLException e) {
            System.out.println(e);
        }

        return false;
    }
    
    public boolean cadastroPonto(CollectPoint ponto) {
        if (nameExist(ponto.getNome())) {
            return false;
        }

        String sql = "INSERT INTO ponto_de_coleta (nome, email, cidade, tipo, latitude, longitude) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conexao = bd_connect.getConexao();
             PreparedStatement ps = conexao.prepareStatement(sql)) {
            
            ps.setString(1, ponto.getNome());
            ps.setString(2, ponto.getEmail());
            ps.setString(3, ponto.getCidade());
            ps.setString(4, ponto.getType());
            ps.setDouble(5, ponto.getLatitude());
            ps.setDouble(6, ponto.getLongitude());
            int ex = ps.executeUpdate();
            return ex > 0;
            
        } catch (SQLException e) {
            System.out.println(e); 
            return false;
        }
    }

}