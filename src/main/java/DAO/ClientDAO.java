/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.ClientDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author vitor
 */
public class ClientDAO {
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<ClientDTO> array = new ArrayList<>();
    
    public void createClient(ClientDTO objClientedto){
        String sql = "INSERT INTO clients (first_name, last_name, email, cpf) values(?,?,?,?)";
        
        conn = new ConexaoDAO().conectarDB();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objClientedto.getFirst_name());
            pstm.setString(2, objClientedto.getLast_name());
            pstm.setString(3, objClientedto.getEmail());
            pstm.setInt(4, objClientedto.getCpf());
            
            pstm.execute();
            pstm.close();
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ClientDAO create:" + erro);
        }
    }
    
    public ArrayList<ClientDTO> readClient(){
        String sql = "SELECT * FROM clients";
        
        conn = new ConexaoDAO().conectarDB();
        
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                ClientDTO objClientDTO = new ClientDTO();
                objClientDTO.setId(rs.getInt("id"));
                objClientDTO.setFirst_name(rs.getString("first_name"));
                objClientDTO.setLast_name(rs.getString("last_name"));
                objClientDTO.setEmail(rs.getString("email"));
                objClientDTO.setCpf(rs.getInt("cpf"));
                
                array.add(objClientDTO);
            }
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, "ClientDAO read:" + error);
        }
        return array;
    }
    
}
