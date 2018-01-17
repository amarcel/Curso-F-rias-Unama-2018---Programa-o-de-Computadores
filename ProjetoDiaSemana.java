
package projetodiasemana;

import java.util.Scanner;

public class ProjetoDiaSemana {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o número do "
                + "dia da semana:");
        n = sc.nextInt();
        
        switch( n ) {
            case 1:
                System.out.println("Domingo");
            break;
            case 2:
                System.out.println("Segunda-feira");
            break;
            case 3:
                System.out.println("Terça-feira");
            break;
            case 4:
                System.out.println("Quarta-feira");
            break;
            case 5:
                System.out.println("Quinta-feira");
            break;
            case 6:
                System.out.println("Sexta-feira");
            break;
            case 7:
                System.out.println("Sábado");
            break;
            default:
                System.err.println("Dia inválido!");
        } // fim do switch
        
    } // fim do main!
    
}
