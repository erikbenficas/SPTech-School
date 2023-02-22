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

//Foi feita uma pesquisa para saber qual o sabor de pizza favorito entre os alunos da Faculdade:
//• Para votar no sabor mussarela, deve-se digitar o valor 5.
//• Para votar no sabor calabresa, deve-se digitar o valor 25.
//• Para votar no sabor quatro queijos, deve- se digitar o valor 50. 
//Leia os votos de 10 alunos diferentes (sem usar vetor) e exiba:
//• Quantos votos obteve cada sabor.
//• Qual o sabor favorito segundo a pesquisa
        
public class Votacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        Integer votoMussa = 0;
        Integer votoCalabresa = 0;
        Integer votoQuatroQueijo = 0;
        
        for(int i = 1; i <= 10; i++){
            System.out.println("Digite o sabor escolhido do aluno" + i);
            Integer voto = leitor.nextInt();
            
            if(voto == 5) {
                votoMussa++;
            } else if(voto == 25){
                votoCalabresa++;
            } else if(voto == 50) {
                votoQuatroQueijo++;
            } else {
                System.out.println("Voto inválido");
            }
        }
        
        String resultado = String.format("Resultado da votação \n "
                + "Mussarela: %d votos \n"
                + "Calabresa: %d votos \n"
                + "Quatro Queijo: %d votos \n" 
        , votoMussa, votoCalabresa, votoQuatroQueijo);
        
        System.out.println(resultado);
        
        if(votoMussa > votoCalabresa && votoMussa > votoQuatroQueijo){
            System.out.println("O sabor mussarela foi o mais votado");
        } else if(votoCalabresa > votoMussa && votoCalabresa > votoQuatroQueijo){
            System.out.println("O sabor calabresa fpoi o mais votado");
        } else if(votoQuatroQueijo > votoMussa && votoQuatroQueijo > votoCalabresa) {
            System.out.println("O sabor quatro queijo foi o mais votado");
        } else {
            System.out.println("Houve um empate nos votos.");
        }
    }
}
