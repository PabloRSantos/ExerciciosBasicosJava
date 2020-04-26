/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication44;

import java.util.Random;

/**
 *
 * @author Artur
 */
public class JavaApplication44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        int[] num = new int[30];
        Random r = new Random();
        for(int i=0; i<num.length; i++){
             numero = r.nextInt(30) + 1;
             for(int j=0; j<num.length; j++){
                   if(numero == num[j] && j != i){
                         numero = r.nextInt(30) + 1;
                   }else{
                        num[i] = numero;
                   }
             }
        }
        //Apresentar na tela o resultado
        for(int i=0; i<num.length; i++){
             System.out.print(num[i]+"  ");
        }

        
    }        
        
       
                   
                }
    
         
    

        
    

    
