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
public class Caloria {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Tempo de aquecimento (em minutos): ");
        Integer tempoAquecimento = leitor.nextInt();
        
        System.out.println("Tempo de exercicio aerobico (em minuto)");
        Integer tempoAerobico = leitor.nextInt();
        
        System.out.println("Tempo de Musculacao (em minutos)");
        Integer tempoMusculacao = leitor.nextInt();
        
        Integer caloriaAquecimento = tempoAquecimento * 12;
        Integer caloriaAerobico = tempoAerobico * 20;
        Integer caloriaMusculacao = tempoMusculacao * 25;
        
        Integer caloriaTotal = caloriaAquecimento + caloriaAerobico + 
                caloriaMusculacao;
        
        Integer tempoTotal = tempoAquecimento + tempoAerobico + tempoMusculacao;
        
        System.out.println("Ola, Jorge! Voce fez um total de " + tempoTotal +
                " minutos de exercicios e perdeu cerca de " + caloriaTotal + 
                " calorias");
    }
}
