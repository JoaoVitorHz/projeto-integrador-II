/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validation;

import Model.UserModel;
import javax.swing.JOptionPane;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * 
 *
 * @author vitor
 */
public class UserValidation {
        
    public boolean ValidateFirstName(UserModel userData){
        
        if(userData.getFirst_name().isEmpty()){
            JOptionPane.showMessageDialog(null, "O nome do usuario não pode estar vazio!");
            return true;
        } 
        else if(!userData.getFirst_name().matches("[^0-9.]+")){
            JOptionPane.showMessageDialog(null, "O nome do usuario não pode ter números!");
            return true;
        }
        
        return false;
    }
    
    public boolean ValidateLastName(UserModel userData){
        if(userData.getLast_name().isEmpty()){
            JOptionPane.showMessageDialog(null, "O sobrenome do usuario não pode estar vazio!");
            return true;
        }
        else if(!userData.getLast_name().matches("[^0-9.]+")){
            JOptionPane.showMessageDialog(null, "O sobrenome do usuario não pode ter números!");
            return true;
        }
        
        return false;
    }
    
    public boolean ValidateEmail(UserModel userData){
        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(userData.getEmail());
        
        if(userData.getEmail().isEmpty()){
            JOptionPane.showMessageDialog(null, "O Email do usuario não pode estar vazio!");
            return true;
        }
        else if(!matcher.matches()){
            JOptionPane.showMessageDialog(null, "O Email do usuario esta invalido!");
            return true;
        }
        return false;
    }
    
    public boolean ValidateCPF(UserModel userData){
        if(!userData.getCpf().matches("[0-9]+")){
            JOptionPane.showMessageDialog(null, "Insira apenas numeros no CPF do usuario!");
            return true;
        }
        else if(!isValidCPF(userData.getCpf())){
            JOptionPane.showMessageDialog(null, "O CPF do usuario esta invalido!");
            return true;
        }
        
        return false;
    }
    
    private static int calcularDigito(String str) {
        int soma = 0;
        int[] pesoCPF = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};
        
        for (int indice = str.length()-1, digito; indice >= 0; indice-- ) {
            digito = Integer.parseInt(str.substring(indice,indice+1));
            soma += digito * pesoCPF[pesoCPF.length - str.length() + indice];
        }
        
        soma = 11 - soma % 11;
        return soma > 9 ? 0 : soma;
    }

    private static boolean isValidCPF(String cpf) {
        if ((cpf == null) || (cpf.length()!= 11)) 
            return false;

        Integer digito1 = calcularDigito(cpf.substring(0,9));
        Integer digito2 = calcularDigito(cpf.substring(0,9) + digito1);
        
        return cpf.equals(cpf.substring(0,9) + digito1.toString() + digito2.toString());
    }
    
}
