
package projetoferias02;

import java.util.Scanner;

public class ProjetoFerias02 {

    public static void main(String[] args) {
        // DECLARAÇÃO DE VARIÁVEIS
        int n1, n2, resto, quociente;
        // ENTRADA DE DADOS
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite número 1:");
        n1 = sc.nextInt();
        System.out.println("Digite número 2:");
        n2 = sc.nextInt();
        // PROCESSAMENTO
        resto = n1 % n2;
        quociente = n1 / n2;
        // SAÍDA DE DADOS
        System.out.println("Resto: " + resto);
        System.out.println("Quociente: " + quociente);
        
    }
    
}
