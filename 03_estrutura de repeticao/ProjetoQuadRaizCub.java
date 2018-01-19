
package projetoquadraizcub;

import java.util.Scanner;

public class ProjetoQuadRaizCub {

    public static void main(String[] args) {
        double n;
        Scanner sc = new Scanner(System.in);
        
        for ( int i = 0 ; i < 5 ; i++ ) {
            System.out.println("Informe um número:");
            n = sc.nextDouble();
            System.out.println("Quadrado: " + ( n * n ) );
            System.out.println("Raiz cúbica: " 
                    + Math.cbrt( n ) );
        }
        
        
    }
    
}
