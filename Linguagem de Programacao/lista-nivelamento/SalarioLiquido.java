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
public class SalarioLiquido {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Digite seu salário bruto: ");
        Double salarioBruto = leitor.nextDouble();
        
        Double descontoInssIr = salarioBruto * 0.7;
        
        System.out.println("Informe o preço da sua condução de ida: ");
        Double vtDia = leitor.nextDouble();
        
        Double descontoVt = 22 * (vtDia * 2);
        Double descontoTotal = descontoVt + (salarioBruto * 0.3);
        Double salarioLiquido = descontoInssIr - descontoVt;
        
        
        
        
        System.out.println("Seu salário bruto é R$ " + salarioBruto +
                " , tem um total de desconto de R$ " + descontoTotal +
                " e receberá um salario liquido de R$ " + salarioLiquido );
    }
}
