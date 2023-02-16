/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erik.linguagem.de.programacao;

import java.util.Scanner;

/**
 *
 * @author erikb
 */
public class Elevador {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Limite de peso do elevador: ");
        Double limitePeso = leitor.nextDouble();
        
        System.out.println("Limite de pessoas: ");
        Integer limitePessoa = leitor.nextInt();
        
        System.out.println("Peso da 1º pessoa");
        Double pessoa1 = leitor.nextDouble();
        
        System.out.println("Peso da 2º pessoa");
        Double pessoa2 = leitor.nextDouble();
        
        System.out.println("Peso da 3º pessoa");
        Double pessoa3 = leitor.nextDouble();
        
        Double pesoTotal = pessoa1 + pessoa2 + pessoa3;
        
        
        System.out.println("Entraram 3 pessoas no elevador, no qual cabem " +
                limitePessoa + ". O peso total do elevador é de " + pesoTotal + 
                " sendo que ele suporta " + limitePeso );
    }
}
