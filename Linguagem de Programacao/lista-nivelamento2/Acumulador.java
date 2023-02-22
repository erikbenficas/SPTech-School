/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erik.segunda.lista.nivelamento;

import java.util.Scanner;

/**
 *
 * @author erikb
 */
public class Acumulador {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Adivinhe o número");
        
        System.out.println("Digite um número: ");
        Integer numeroDigitado = leitor.nextInt();
        
        Integer soma = 0;
        while(numeroDigitado != 0){
            soma += numeroDigitado;
            System.out.println("Digite um número");
            numeroDigitado = leitor.nextInt();
            
        }
        
        System.out.println("A soma dos números é " + soma);
        
        
    }
}
