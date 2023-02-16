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
public class CalculadoraTroco {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Valor do produto: ");
        Double valorProduto = leitor.nextDouble();
        
        System.out.println("Quantidade vendida: ");
        Double qntdVendida = leitor.nextDouble();
        
        System.out.println("Valor pago pelo cliente: ");
        Double valorPagoCliente = leitor.nextDouble();
        
        Double valorTotal = qntdVendida * valorProduto;
        
        Double troco = valorPagoCliente - valorTotal;
        
        System.out.println("Seu troco será de R$ " + troco );
    }
}
