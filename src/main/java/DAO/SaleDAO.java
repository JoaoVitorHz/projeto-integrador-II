/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.ProductModel;
import Model.SaleModel;
import Model.UserModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Ana Karolyne da Silva
 * @author Danilo dos Santos Barbosa Martins
 * @author Jailson Jorge da Silva
 * @author João Vitor Araujo de Matos
 * @author Leonardo Feitosa da Silva
 * @author Luana Figueiredo de Andrade Caboz
 * @author Thomaz Gabriel Azevedo Oliveira  
 */

public class SaleDAO {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<SaleModel> array = new ArrayList<>();
    
    public void CreateSale(UserModel userModel, ProductModel productModel){
        String sql = "INSERT INTO sale (product_name, product_qtd, product_price, cpf_user) values(?,?,?,?)";
        
        conn = new ConexaoDAO().conectarDB();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, productModel.getNome());
            pstm.setInt(2, productModel.getQtd());
            pstm.setFloat(3, productModel.getPreco());
            pstm.setString(4, userModel.getCpf());
            
            pstm.execute();
            pstm.close();
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "UserDAO CreateUser:" + erro);
        }
    }
    
     public ArrayList<SaleModel> ReadSale(){
        String sql = "SELECT * FROM sale";
        
        conn = new ConexaoDAO().conectarDB();
        
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                SaleModel saleModel = new SaleModel();
                saleModel.setProductName(rs.getString("product_name"));
                saleModel.setQtd(rs.getInt("product_qtd"));
                saleModel.setProductPrice(rs.getFloat("product_price"));
                saleModel.setCpf(rs.getString("cpf_user"));
                
                array.add(saleModel);
            }
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, "UserDAO read:" + error);
        }
        return array;
    }
    
}
