
package projetofaixavalores;

import java.util.Scanner;

public class ProjetoFaixaValores {

    public static void main(String[] args) {
        double n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        n = sc.nextDouble();
        
        if( n >= 0.0 && n <= 100.0 ) {
            System.out.println(n + " está na faixa.");
        } else {
            System.out.println(n + " está fora da faixa.");
        }
        
    } // fim do main!
    
}
