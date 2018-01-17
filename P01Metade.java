
package p01metade;

import java.util.Scanner;

public class P01Metade {

    public static void main(String[] args) {
        // DECLARAÇÃO:
        double n, metade;
        // ENTRADA:
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número:");
        n = sc.nextDouble();
        if ( n > 20 ) {
            metade = n / 2.0;
            System.out.println("Metade de " + n + 
                    " = " + metade);
        }
        System.out.println("Encerrando o programa...");
        
    }
    
}
