
package projetoferias01;

import java.util.Scanner;

public class ProjetoFerias01 {

    public static void main(String[] args) {
        // DECLARAÇÕES DE VARIÁVEIS
        String nome;
        int idade;
        // ENTRADA DE DADOS
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome:");
        nome = sc.nextLine();
        System.out.println("Digite a idade:");
        idade = sc.nextInt();
        // SAÍDA DE DADOS
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        
    }
    
}
