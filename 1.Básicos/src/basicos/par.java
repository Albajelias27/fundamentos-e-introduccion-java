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
public class par {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int num=sn.nextInt();
        
        if(num%2==0){
            System.out.println("el numero es par");
        }else{
            System.out.println("el numero no es par");
        }
    }
    
}
