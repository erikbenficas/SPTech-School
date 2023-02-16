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
public class CalculoMedia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Nome do aluno: ");
        String nomeAluno = leitor.nextLine();
        
        System.out.println("Nota 1: ");
        Double nota1 = leitor.nextDouble();
        
        System.out.println("Nota 2: ");
        Double nota2 = leitor.nextDouble();
        
        Double notaMedia = (nota1 + nota2) / 2;
        
        System.out.println("Olá, " + nomeAluno + 
                ". Sua média foi de " + notaMedia);
    }
}
