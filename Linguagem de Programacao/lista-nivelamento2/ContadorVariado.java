    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erik.segunda.lista.nivelamento;

/**
 *
 * @author erikb
 */

//Crie uma classe chamada ContadorVariado que: 
//• Usando for, começe exibindo o valor 0.15 e depois 0.30, depois 0.45, depois 0.60... ou 
//seja, aumente de 0.15 em 0.15 a cada iteração até que o último número seja menor que 5. 
//• Use interpolação p/ exibir o número com 2 casas decimais
               
public class ContadorVariado {
    public static void main(String[] args) {
        
        for(Double i = 0.15; i < 5; i+=0.15) {
            String resultado = String.format("Resultado: %.2f" , i);
            
            System.out.println(resultado);
        }
    }
}
