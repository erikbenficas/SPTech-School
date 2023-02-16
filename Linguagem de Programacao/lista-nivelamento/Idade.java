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
public class Idade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Qual é o seu nome: ");
        String nome = leitor.nextLine();
        
        System.out.println("Olá, " + nome + "! Qual o ano de seu nascimento? ");
        Integer dataNasc = leitor.nextInt();
        
        Integer idade2030 = 2030 - dataNasc;
        
        System.out.println("Em 2030 você terá " + idade2030 + " anos");
        
    }
}
