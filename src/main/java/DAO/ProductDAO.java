/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.ProductModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author vitor
 */
public class ProductDAO {
    
    Connection conn; //Propriedade para conectar no banco
    PreparedStatement pstm; //Propriedade para prepara as querys para o banco
    ResultSet rs; //Propriedade para os dados que vem do banco
    ArrayList<ProductModel> array = new ArrayList<>(); //Array para pegar os dados do banco e mandar para view
    
    public void CreateProduct(ProductModel objProdutodto){
        String sql = "INSERT INTO product (product_name, product_price, product_qtd) values(?,?,?)";
        
        conn = new ConexaoDAO().conectarDB();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objProdutodto.getNome());
            pstm.setDouble(2, objProdutodto.getPreco());
            pstm.setInt(3, objProdutodto.getQtd());
            
            pstm.execute();
            pstm.close();
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ProdutoDAO create:" + erro);
        }
    }
    
    public ArrayList<ProductModel> ReadProduct(){
        String sql = "SELECT * FROM product";
        
        conn = new ConexaoDAO().conectarDB();
        
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                ProductModel objProdutodto = new ProductModel();
                objProdutodto.setId(rs.getInt("id"));
                objProdutodto.setNome(rs.getString("product_name"));
                objProdutodto.setPreco(rs.getFloat("product_price"));
                objProdutodto.setQtd(rs.getInt("product_qtd"));
                
                array.add(objProdutodto);
            }
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, "ProdutoDAO read:" + error);
        }
        return array;
    }
    
    public void UpdateProduct(ProductModel objProdutoDTO){
        String sql = "UPDATE product set product_name = ?, product_price = ?, product_qtd = ? WHERE id = ?";
        
        conn = new ConexaoDAO().conectarDB();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objProdutoDTO.getNome());
            pstm.setDouble(2, objProdutoDTO.getPreco());
            pstm.setInt(3, objProdutoDTO.getQtd());
            pstm.setInt(4, objProdutoDTO.getId());
            
            pstm.execute();
            pstm.close();
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ProdutoDAO Update:" + erro);
        }
    }
    
    public void DeleteProduct(ProductModel objProductDTO){
        String sql = "DELETE FROM product WHERE id = ?";
         
        conn = new ConexaoDAO().conectarDB();
           
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objProductDTO.getId());

            pstm.execute();
            pstm.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ProdutotDAO Delete:" + erro);
        }
    }
}
