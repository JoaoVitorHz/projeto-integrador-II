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
    
    Connection conn; //Propriedade para conectar no banco
    PreparedStatement pstm; //Propriedade para prepara as querys para o banco
    ResultSet rs; //Propriedade para os dados que vem do banco
    ArrayList<ClientDTO> array = new ArrayList<>(); //Array para pegar os dados do banco e mandar para view
    
    public void createClient(ClientDTO objClientedto){
        String sql = "INSERT INTO clients (first_name, last_name, email, cpf) values(?,?,?,?)";
        
        conn = new ConexaoDAO().conectarDB();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objClientedto.getFirst_name());
            pstm.setString(2, objClientedto.getLast_name());
            pstm.setString(3, objClientedto.getEmail());
            pstm.setString(4, objClientedto.getCpf());
            
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
                objClientDTO.setId(rs.getInt("id_client"));
                objClientDTO.setFirst_name(rs.getString("first_name"));
                objClientDTO.setLast_name(rs.getString("last_name"));
                objClientDTO.setEmail(rs.getString("email"));
                objClientDTO.setCpf(rs.getString("cpf"));
                
                array.add(objClientDTO);
            }
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, "ClientDAO read:" + error);
        }
        return array;
    }
    
    public void UpdateClient(ClientDTO objClientDTO){
        String sql = "UPDATE client set first_name = ?, last_name = ?, email = ?, cpf = ? WHERE id_client = ?";
        
        conn = new ConexaoDAO().conectarDB();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objClientDTO.getFirst_name());
            pstm.setString(2, objClientDTO.getLast_name());
            pstm.setString(3, objClientDTO.getEmail());
            pstm.setString(4, objClientDTO.getCpf());
            pstm.setInt(5, objClientDTO.getId());
            
            pstm.execute();
            pstm.close();
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ClientDAO Update:" + erro);
        }
    }
    
    public void DeleteClient(ClientDTO objClientDTO){
        String sql = "DELETE FROM client WHERE id_client = ?";
         
        conn = new ConexaoDAO().conectarDB();
           
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objClientDTO.getId());

            pstm.execute();
            pstm.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ClientDAO Delete:" + erro);
        }
    }
}
