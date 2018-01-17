
package projetoopmatematica;

import java.util.Scanner;

public class ProjetoOpMatematica {

    public static void main(String[] args) {
        int    op;
        double n1, n2, resultado;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite n1:");
        n1 = sc.nextDouble();
        System.out.println("Digite n2:");
        n2 = sc.nextDouble();
        System.out.println("Operação desejada:");
        System.out.println("1: Soma");
        System.out.println("2: Subtração");
        System.out.println("3: Multiplicação");
        System.out.println("4: Divisão");
        System.out.println("5: Raiz quadrada");
        op = sc.nextInt();
        
        switch( op ) {
            case 1: //soma
                System.out.println("SOMA: " + (n1 + n2));
            break;
            case 2: //subtracao
                System.out.println("SUBTRAÇÃO: " + (n1 - n2));
            break;
            case 3: //mult
                System.out.println("MULTIPLICAÇÃO: " + (n1 * n2));
            break;
            case 4: //div
                System.out.println("DIVISÃO: " + (n1 / n2));
            break;
            case 5: //raiz
                System.out.println("RAIZ QUADRADA: " + Math.sqrt(n1)
                        + " / " + Math.sqrt(n2));
            break;
            default:
                System.err.println("Erro! Operação inválida");
        }
        
        
    } // fim do main
    
}
