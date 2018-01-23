
package projetovetornome;

import java.util.Scanner;

public class ProjetoVetorNome {

    public static void main(String[] args) {
        // declaração
        int TAMANHO = 5;
        String[] nomes = new String[ TAMANHO ];
        // entrada de dados
        Scanner sc = new Scanner(System.in);
        for ( int i = 0 ; i < TAMANHO ; i++ ) {
            System.out.println( "Entre com o nome " + (i+1) );
            nomes[ i ] = sc.nextLine();
        }
        // saída de dados
        System.out.println("### SAÍDA ###");
        for ( int i = 0 ; i < TAMANHO ; i++ ) {
            System.out.println( nomes[ i ] );
        }
        
        
    }
    
}
