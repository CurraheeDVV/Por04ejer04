/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro04ejer04;

import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class Pro04ejer04 {

    
    
    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {
        // TODO code application logic here
  
        System.out.println("Que quieres hacer? pulsa 1 para sumar, 2 para potencia:");
        Scanner opcion  = new Scanner(System.in);
        int z = opcion.nextInt();
        if(z == 1){
            suma(1,1);
        }else if(z == 2){
            potencia(0,0);
        }else{System.out.println("Lo siento, solo 1 o 2.");
        
        }
    }
    
    /**
     *
     * @param i
     * @param j
     * @return
     */
    public static int suma(int i, int j){
        
       
       Scanner Calculo = new Scanner(System.in);  
        System.out.println("Escribre los numeros que quieres sumar");
        i = Calculo.nextInt();
        j = Calculo.nextInt(); 
        
        int dato;
        dato = i + j;
        System.out.println("El resultado es " + dato);
        return dato;
    } 
   
   public static  double potencia(Integer a, Integer b){ 
       System.out.println("Escribe los numeros que quieres calcular");
   
     Scanner Calculo2 = new Scanner(System.in);
        a = Calculo2.nextInt();
        b= Calculo2.nextInt();
        double resultado = Math.pow(a, b);
        
      
   System.out.println(resultado + "El resultado de la pontencia es " + resultado);
        return resultado;
   } 
       
      
        
   } 

