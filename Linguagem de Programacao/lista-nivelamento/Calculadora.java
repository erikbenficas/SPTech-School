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
public class Calculadora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Digite um número: ");
        Double firtNumber = leitor.nextDouble();
        
        System.out.println("Digite outro número: ");
        Double secondNumber = leitor.nextDouble();
        
        Double soma = firtNumber + secondNumber;
        Double sub = firtNumber - secondNumber;
        Double multip = firtNumber * secondNumber;
        Double div = firtNumber / secondNumber;
        
        System.out.println("Digite um número: " + firtNumber );
        
        System.out.println("Digite outro número: " + secondNumber );
        
        System.out.println("Resultado da soma: \n" + soma  );
        System.out.println("Resultado da subtração: \n" + sub  );
        System.out.println("Resultado da multiplicação: \n" + multip );
        System.out.println("Resultado da divi`ão: \n" + div  );
    }
}
