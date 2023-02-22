/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erik.segunda.lista.nivelamento;

/**
 *
 * @author erikb
 */
public class NumeroImpar {
    public static void main(String[] args) {
        
        System.out.println("Exibição dos números impares de 0 a 90");
        
        for(int i = 0; i <= 90; i++) {
            if(i %2 != 0) {
                System.out.println(i);
            }
        }
    }
}
