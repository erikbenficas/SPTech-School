/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erik.segunda.lista.nivelamento;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author erikb
 */

//Crie uma classe chamada Sorteio que: 
//• Solicite um número de 1 a 100 apenas uma vez.
//• Realize 200 sorteios. 
//Ao final, exibir:
//• Quando o número foi sorteado pela 1ª vez (apresente a posição do sorteio)
//• Quantos números pares foram sorteados.
//• Quantos números ímpares foram sorteados.

public class Sorteio {
    public static void main(String[] args) {
     Scanner leitor = new Scanner (System.in);
     
        System.out.println("Digite um número de 0 a 100");
        Integer numeroDigitado = leitor.nextInt();
        
        Random random = new Random();
        
        Integer numeroImpar = 0;
        Integer numeroPar = 0;
        Integer sorteio = 0;
        Boolean numeroSorteado = false;
        
        for(int i = 0; i <= 200; i++ ) {
            sorteio = random.nextInt(100) +1;
            
            if(sorteio == numeroDigitado && !numeroSorteado) {
                System.out.println("O número foi sorteado na posição " + i);
                numeroSorteado = true;
            }
            if(sorteio % 2 == 0) {
                numeroPar ++;
            } else {
                numeroImpar ++;
            }
            
            String frase = String.format("Par %d | Impar %d"
            , numeroPar, numeroImpar);
            
            System.out.println(frase);
        }
    }
}
