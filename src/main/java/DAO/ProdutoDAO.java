/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.ProdutosModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author vitor
 */
public class ProdutoDAO {
    
    Connection conn; //Propriedade para conectar no banco
    PreparedStatement pstm; //Propriedade para prepara as querys para o banco
    ResultSet rs; //Propriedade para os dados que vem do banco
    ArrayList<ProdutosModel> array = new ArrayList<>(); //Array para pegar os dados do banco e mandar para view
    
    public void CreateProduto(ProdutosModel objProdutodto){
        String sql = "INSERT INTO produtos (product_name, preco, qtd) values(?,?,?)";
        
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
    
    public ArrayList<ProdutosModel> ReadProduct(){
        String sql = "SELECT * FROM product";
        
        conn = new ConexaoDAO().conectarDB();
        
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                ProdutosModel objProdutodto = new ProdutosModel();
                objProdutodto.setId(rs.getInt("id_product"));
                objProdutodto.setNome(rs.getString("product_name"));
                objProdutodto.setPreco(rs.getDouble("preco"));
                objProdutodto.setQtd(rs.getInt("quantidade"));
                
                array.add(objProdutodto);
            }
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, "ProdutoDAO read:" + error);
        }
        return array;
    }
    
    public void UpdateProduto(ProdutosModel objProdutoDTO){
        String sql = "UPDATE produto set name_product = ?, preco = ?, quantidade = ? WHERE id_produto = ?";
        
        conn = new ConexaoDAO().conectarDB();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objProdutoDTO.getNome());
            pstm.setDouble(2, objProdutoDTO.getPreco());
            pstm.setInt(3, objProdutoDTO.getQtd());
            pstm.setInt(3, objProdutoDTO.getId());
            
            pstm.execute();
            pstm.close();
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ProdutoDAO Update:" + erro);
        }
    }
    
    public void DeleteProduto(ProdutosModel objProductDTO){
        String sql = "DELETE FROM produto WHERE id_produto = ?";
         
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
