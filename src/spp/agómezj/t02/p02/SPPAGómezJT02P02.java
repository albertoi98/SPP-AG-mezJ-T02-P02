/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.agómezj.t02.p02;
import java.util.Scanner;

/**
 *
 * @author Alberto
 */
public class SPPAGómezJT02P02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        int valinf, valsup;
        Scanner kb = new Scanner (System.in);
        
        System.out.println("Introduzca un valor inferior");
        valinf= kb.nextInt();
        System.out.println("Introduzca un valor superior");
        valsup= kb.nextInt();
        
        for (int i=1;i<(valsup-valinf);i++){
            int valor=valinf+i;
            
            if (valor%2==0){
                System.out.println("El numero "+valor+" es par");
            }else{
                System.out.println("El numero "+valor+" no es par");
            }
            if (valor%3==0){
                System.out.println("El numero "+valor+" es divisible entre 3");
            }else{
                System.out.println("El numero "+valor+" no es divisible entre 3");
            }
            if (valor%5==0){
                System.out.println("El numero "+valor+" es divisible entre 5");
            }else{
                System.out.println("El numero "+valor+" no es divisible entre 5");
            }
        }
    }
    
}
