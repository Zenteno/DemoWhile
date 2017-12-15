/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demowhile;

/**
 *
 * @author Concepción
 */
public class DemoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 10;
        while(i < 20) {
            if (i % 2 == 0) {
                System.out.println("El numero " + i + " es par");
            } else {
                System.out.println("El numero " + i + " es impar");
            }
            i++;
        }
        
        // "do-while" equivalete a un "for". Imprime de 0 a 9
        // Ejecutara AL MENOS UNA VEZ
        int k = 10;
        do {
            System.out.println(k);
            k++;
        } while(k < 10);
    }
    
}
