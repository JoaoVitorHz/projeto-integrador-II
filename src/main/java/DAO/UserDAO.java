/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.UserModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author vitor
 */
public class UserDAO {
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<UserModel> array = new ArrayList<>();
    
    public void CreateUser(UserModel userModel){
        String sql = "INSERT INTO user (first_name, last_name, email, cpf) values(?,?,?,?)";
        
        conn = new ConexaoDAO().conectarDB();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, userModel.getFirst_name());
            pstm.setString(2, userModel.getLast_name());
            pstm.setString(3, userModel.getEmail());
            pstm.setString(4, userModel.getCpf());
            
            pstm.execute();
            pstm.close();
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "UserDAO CreateUser:" + erro);
        }
    }
    
    public ArrayList<UserModel> ReadUser(){
        String sql = "SELECT * FROM user";
        
        conn = new ConexaoDAO().conectarDB();
        
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                UserModel userModel = new UserModel();
                userModel.setId(rs.getInt("id"));
                userModel.setFirst_name(rs.getString("first_name"));
                userModel.setLast_name(rs.getString("last_name"));
                userModel.setEmail(rs.getString("email"));
                userModel.setCpf(rs.getString("cpf"));
                
                array.add(userModel);
            }
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, "UserDAO read:" + error);
        }
        return array;
    }
    
    public void UpdateUser(UserModel userModel){
        String sql = "UPDATE user set first_name = ?, last_name = ?, email = ?, cpf = ? WHERE id = ?";
        
        conn = new ConexaoDAO().conectarDB();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, userModel.getFirst_name());
            pstm.setString(2, userModel.getLast_name());
            pstm.setString(3, userModel.getEmail());
            pstm.setString(4, userModel.getCpf());
            pstm.setInt(5, userModel.getId());
            
            pstm.execute();
            pstm.close();
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "UserDAO Update:" + erro);
        }
    }
    
    public void DeleteUser(UserModel userModel){
        String sql = "DELETE FROM user WHERE id= ?";
         
        conn = new ConexaoDAO().conectarDB();
           
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, userModel.getId());

            pstm.execute();
            pstm.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "UserDAO Delete:" + erro);
        }
    }
}
