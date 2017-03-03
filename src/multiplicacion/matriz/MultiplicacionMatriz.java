/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicacion.matriz;

import java.util.Scanner;

/**
 *Esta clase realiza una multiplicación entre 2 matrices
 * @author Paola Joya, David Santiago Castro
 * @version 02/03/2017
 */
public class MultiplicacionMatriz {
    int fila1,columna1,fila2,columna2;
    int [] [] matriz3,matriz2,matriz1;
    Scanner matriz= new Scanner (System.in);
    /**
     * Metodo que recibe el tamaño de las 2 matrices
     */
    public void tamañoMatriz (){
        System.out.println("Digite el tamaño de la fila de la primera matriz");
        fila1=matriz.nextInt ();
        System.out.println("Digite el tamaño de la columna de la primera matriz");
        columna1=matriz.nextInt();
        matriz1= new int [fila1] [columna1];
        System.out.println("Digite el tamaño de la fila de la segunda matriz");
        fila2=matriz.nextInt ();
        System.out.println("Digite el tamaño de la columna de la segunda matriz");
        columna2=matriz.nextInt();
        matriz2= new int [fila2] [columna2];
    }//fin metodo tamañoMatriz
    /**
     * Metodo que evalua y recibe los valores de las matrices
     *
     */
    public void evaluaMatrices (){
        if (columna1==fila2){
            matriz3= new int [fila1] [columna2];
        for (int i=0;i<fila1;i++){
            for (int j=0; j<columna1;j++){
                System.out.println("Digite un numero para la posicion["+i+"]["+j+"]"+" de la primera matriz");
                matriz1 [i] [j]=matriz.nextInt();
            }
        }
         for (int i=0;i<fila2;i++){
            for (int j=0; j<columna2;j++){
                System.out.println("Digite un numero para la posicion["+i+"]["+j+"]"+" de la segunda matriz");
                matriz2 [i] [j]=matriz.nextInt();
            }
        }
    }
        else
            System.out.println("Las matrices no se pueden multiplicar");
    }//fin metodo evaluaMatrices
    /**
     * Metodo que multiplica las matrices
     */
   
    public void multiplicar (){
        for (int i=0; i<fila1;i++){
            for (int j=0; j<columna1;j++){
                matriz3[i] [j]=0;
                for (int k=0;k<columna2;k++){
                    matriz3 [i] [j]+= matriz1[i][k]*matriz2 [k] [j];
                   
                }
                 System.out.print(matriz3[i] [j] +"\t");
            }
            System.out.println();
        }
        
    }// Fin metodo multiplicar
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MultiplicacionMatriz llamada= new MultiplicacionMatriz();
        llamada.tamañoMatriz();
        llamada.evaluaMatrices();
        llamada.multiplicar();
        // TODO code application logic here
    }
    
}
