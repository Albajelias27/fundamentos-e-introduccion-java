/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicos;
import java.util.Scanner;
/**
 *
 * @author Elias
 */
public class mayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Introduzca un numero1");
        int num1=sn.nextInt();
        System.out.println("Introduzca un numero2");
        int num2=sn.nextInt();
        
        if(num1<num2){
            System.out.println("el numero mayor es "+ num2);
        }else {
            if(num1>num2){
                System.out.println("el numero mayor es "+num1);
            }else{
                System.out.println("son iguales");
            }
        }
}
}