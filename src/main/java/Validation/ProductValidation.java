/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validation;

import Model.ProductModel;
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
