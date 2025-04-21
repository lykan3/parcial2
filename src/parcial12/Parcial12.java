/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial12;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LYKAN
 */
public class Parcial12 {
 

    /**
     * jose cardenas morales
     * samuel gonzalez
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scaner = new Scanner (System.in);
        int matriz [][]= new int [4][4];
        ArrayList<String> nombre = new ArrayList<>(10);
        System.out.println("1.calcular area del circulo\n2.ingrezar datos array\n3.lista array\n4.pocision especifica\n5.ingrezar datos en matriz\n6.datos de matriz\n7.datoz posicion especifica\n8salir");
         int n = scaner.nextInt();
         
        while(true){
            switch(n){
                case 1:
                    System.out.println("digite el valor del radio:");
                    float radio = scaner.nextFloat();
                    float r= (float) (3.14 *( Math.pow(radio, 2)));
                    System.out.println("el area es:"+ r);
                case 2:
                    for (int i = 0; i < 10; i++) {
                       System.out.println("ingresa el nonbre que desea guardar:");
                       String datos =scaner.nextLine();
                        nombre.add(datos);
                    }
                case 3:
                    for(String datos: nombre)    {
                        System.out.println(datos);
                    }                
                case 4:
                    System.out.println("digite la posicion a imprimir:");
                    byte p=scaner.nextByte();
                    int i = p-1;
                    System.out.println(nombre.get(i));
                        
                    }
                    
                case 5:
                   for (int f = 0; f < matriz.length; f++){
            for (int c = 0; c < matriz.length; c++) {
                System.out.println("ingrese el valor de la fila"+f+"columna"+c);
                matriz[f][c]= scaner.nextInt(); 
            }
                   }
                case 6:
                    for (int f = 0; f < matriz.length; f++) {
                         for (int c = 0; c < matriz.length; c++) {
                         if (f==0 && c==2){
                System.out.println("el valor de la posion"+f+"la posicion "+c+ "valor"+matriz[f][c]);
                        }
                     }
                    }
                    
                case 7:
                    System.out.println("digite el valor de la fila del 0 al 3:");
                    byte f = scaner.nextByte();
                    System.out.println("digite el valor de la columna del 0 al 3:");
                    byte c= scaner.nextByte();
                    System.out.println("el valor de esa posicion es"+ matriz[f][c]);
                case 8:
                    break;
                    
            }
        }
    }
    
}
