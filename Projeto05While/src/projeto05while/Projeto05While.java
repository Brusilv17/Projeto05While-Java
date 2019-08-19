/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto05while;

/**
 *
 * @author mathe
 */
public class Projeto05While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int idade = 15;
        
        while(idade < 18){
            System.out.println("Idade: " + idade);
            idade += 1;
        }
        
        int cont = 10;
        while(cont >= 0){
            System.out.println("Valor: " + cont);
            cont -= 1;
        }
    }   
}