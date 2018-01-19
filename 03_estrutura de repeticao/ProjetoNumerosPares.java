
package projetonumerospares;

import java.util.Scanner;

public class ProjetoNumerosPares {

    public static void main(String[] args) {
        int limiteInicial, limiteFinal;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite limite inicial:");
        limiteInicial = sc.nextInt();
        System.out.println("Digite limite final:");
        limiteFinal   = sc.nextInt();
        
        for ( int i = limiteInicial ; i <= limiteFinal ; i++ ) {
            if ( i % 2 == 0 ) {
                System.out.println( i );
            }
        }
        
        
    }
    
}
