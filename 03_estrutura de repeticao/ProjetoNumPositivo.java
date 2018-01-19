
package projetonumpositivo;

import java.util.Scanner;

public class ProjetoNumPositivo {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Digite um número:");
            n = sc.nextInt();
            if( n <= 0 ) {
                break;
            }
            System.out.println("NÚMERO POSITIVO");
        } while ( true );
        
//        while ( n > 0 ) {
//            System.out.println("NÚMERO POSITIVO");
//            System.out.println("Digite um número:");
//            n = sc.nextInt();
//        }
        
        System.out.println("LOOP FINALIZADO!");
        
    }
    
}
