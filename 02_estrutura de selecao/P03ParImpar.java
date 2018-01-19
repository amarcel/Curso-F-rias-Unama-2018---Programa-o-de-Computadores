
package p03parimpar;

import java.util.Scanner;

public class P03ParImpar {

    public static void main(String[] args) {
        int n;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número:");
        n = sc.nextInt();
        
        if(n % 2 == 0) {
            System.out.println( n + " é par" );
        } else {
            System.out.println( n + " é ímpar" );
        }
        
    }
    
}
