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
public class Login {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Login:");
        String login = leitor.nextLine();
        
        System.out.println("Senha:");
        String senha = leitor.nextLine();
        
        String i ;
        while (!login .equals("admin") || !senha .equals("#SPtech2022")) {
            System.out.println("\n Login ou senha inválidos \n");
            
            System.out.println("Login: ");
            login = leitor.nextLine();
            System.out.println("Senha: ");
            senha = leitor.nextLine();
        }
        
        System.out.println("Login realizado com sucesso");
        
    }
}
