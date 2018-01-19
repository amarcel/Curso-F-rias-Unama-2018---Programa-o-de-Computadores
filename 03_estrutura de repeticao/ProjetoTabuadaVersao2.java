
package projetotabuadaversao2;

import java.util.Scanner;

public class ProjetoTabuadaVersao2 {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        n = sc.nextInt();
        
        System.out.println("### TABUADA ###");
        for ( int i = 1 ; i <= 10 ; i++ ) {
            System.out.println( i + " x " + n + " = " + ( i * n ) );
        }
//        int i = 1;
//        while( i <= 10 ){
//            System.out.println( i + " x " + n + " = " + ( i * n ) );
//            i++;
//        }
//        int i = 1;
//        do {
//            System.out.println( i + " x " + n + " = " + ( i * n ) );
//            i++;
//        } while( i <= 10 );
        
    }
    
}
