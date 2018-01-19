
package p02calcraizquadrada;

import java.util.Scanner;

public class P02CalcRaizQuadrada {

    public static void main(String[] args) {
        double n1, n2, soma, raizQuad;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite n1:");
        n1 = sc.nextDouble();
        System.out.println("Digite n2:");
        n2 = sc.nextDouble();
        soma = n1 + n2;
        if(soma > 50 && soma < 100) {
            raizQuad = Math.sqrt(soma);
            System.out.println("Raiz quadrada de " + soma 
                    + " = " + raizQuad);
        } // fim do IF
        
    }
    
}
