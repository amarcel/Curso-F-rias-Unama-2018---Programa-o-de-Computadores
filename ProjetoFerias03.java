package projetoferias03;

import java.util.Scanner;

public class ProjetoFerias03 {

    public static void main(String[] args) {
        //DECLARAÇÃO DE VARIÁVEIS:
        double base, altura, area;
        //ENTRADA:
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a base:");
        base = sc.nextDouble();
        System.out.println("Digite a altura:");
        altura = sc.nextDouble();
        //PROCESSAMENTO:
        area = ( base * altura ) / 2.0;
        //SAÍDA:
        //System.out.println("Área triângulo: " + area);
        System.out.printf("Área triângulo: %.2f", area);
        
    }
    
}
