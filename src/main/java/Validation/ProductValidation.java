/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validation;

import Model.ProductModel;
import javax.swing.JOptionPane;

/**
 *
 * @author vitor
 */
public class ProductValidation {
    
    public boolean ValidateProductName(ProductModel productModel){
        if(productModel.getNome().isEmpty()){
            JOptionPane.showMessageDialog(null, "O nome do produto não pode estar vazio!");
            return true;
        }
        return false;
    }
    
    public boolean ValidateProductQtd(ProductModel productModel){
        if(productModel.getQtd() < 0){
            JOptionPane.showMessageDialog(null, "A quantidade de produtos não pode ser menor do que 0");
            return true;
        }
        return false;
    }

    
}
