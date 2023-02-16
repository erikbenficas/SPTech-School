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
public class BolsaFilho {
        
    public static void main(String[] args) {
    Scanner leitor = new Scanner (System.in);
    
        System.out.println("Filhos de 0 a 3 anos de idade: ");
        Integer zeroTres = leitor.nextInt();
        
        System.out.println("Filhos de 4 a 16 anos de idade: ");
        Integer quatroDezesseis = leitor.nextInt();
        
        System.out.println("Filhos de 17 a 18 anos de idade: ");
        Integer dezesseteDezoito = leitor.nextInt();
        
        
        Double campo1 = zeroTres * 25.12;
        Double campo2 = quatroDezesseis * 15.88;
        Double campo3 = dezesseteDezoito * 12.44;
        
        Integer totalFilho = zeroTres + quatroDezesseis + dezesseteDezoito;
        
        Double totalReceber = campo1 + campo2 + campo3;
        
        System.out.println("Voce tem um total de " + totalFilho +
                " filhos e vai receber R$ " + totalReceber);
    }
}
