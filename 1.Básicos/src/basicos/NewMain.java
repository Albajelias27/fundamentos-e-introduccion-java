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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int num=sn.nextInt();
        
        char caracter= (char)num;
        
        System.out.println("el numero corresponde a "+ caracter);
    }
    
}
