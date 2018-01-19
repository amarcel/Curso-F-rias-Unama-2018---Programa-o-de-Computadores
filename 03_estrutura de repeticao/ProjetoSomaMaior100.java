
package projetosomamaior100;

import java.util.Scanner;

public class ProjetoSomaMaior100 {

    public static void main(String[] args) {
        double n1, n2, soma;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("Número 1:");
            n1 = sc.nextDouble();
            System.out.println("Número 2:");
            n2 = sc.nextDouble();
            soma = n1 + n2;
        } while ( soma > 99.0 );
        System.out.println("FINALIZAÇÃO...");
        
    }
    
}
