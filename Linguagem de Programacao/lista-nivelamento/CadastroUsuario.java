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
public class CadastroUsuario {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite seu login: ");
        String usuario = leitor.nextLine();
        
        System.out.println("Digite sua senha: ");
        String senha = leitor.nextLine();
        
        System.out.println("Digite a quantidade de tentativa da senha senha: ");
        Integer tentativa = leitor.nextInt();
        
        System.out.println("Seu login: " + usuario + " e sua senha: " 
                + senha + "Voce tem " + tentativa + " tentativas antes de ser "
                + "bloqueado"
                );
    }
}
