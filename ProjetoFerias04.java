package projetoferias04;

import java.util.Scanner;

public class ProjetoFerias04 {

    public static void main(String[] args) {
        // DECLARAÇÃO: 
        double n1, n2, n3, soma, raizQuad;
        // ENTRADA:
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite n1:");
        n1 = sc.nextDouble();
        System.out.println("Digite n2:");
        n2 = sc.nextDouble();
        System.out.println("Digite n3:");
        n3 = sc.nextDouble();
        // PROCESSAMENTO:
        soma = n1 + n2 + n3;
        raizQuad = Math.sqrt(soma);
        // SAÍDA:
        System.out.println("Raiz quadrada de " + 
                soma + " = " + raizQuad);
        
        
    }
    
}
