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
public class Potencia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Digite o número da base: ");
        Integer base = leitor.nextInt();
        
        System.out.println("Digite o número do expoente: ");
        Integer expoente = leitor.nextInt();
        
        Double resultado = Math.pow(base, expoente);
        
        System.out.println("A potência desse número é: " + resultado);
    }
}
