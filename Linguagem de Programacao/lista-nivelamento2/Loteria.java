/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erik.segunda.lista.nivelamento;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author erikb
 */
public class Loteria {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um numero de 0 a 10");
        Integer numeroDigitado = leitor.nextInt();
        
        Integer numeroSorteado = ThreadLocalRandom.current().nextInt(1, 11);
        
        
        Integer i = 0;
        while(numeroDigitado != numeroSorteado){
            numeroSorteado = ThreadLocalRandom.current().nextInt(1, 11);
                    System.out.println(numeroSorteado);
                    i++;
        }
        
        if(i<=3){
            System.out.println("Você é muito sortudo");
        } else if(i>=4 && i<=10) {
            System.out.println("Você é sortudo");
        } else{
            System.out.println("É melhor você parar de apostar e ir trabalhar");
        }
    }
}
