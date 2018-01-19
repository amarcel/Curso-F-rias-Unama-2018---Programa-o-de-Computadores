
package projetoemprestimo;

import java.util.Scanner;

public class ProjetoEmprestimo {

    public static void main(String[] args) {
        double salarioBruto, valorPrestacao;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o salário:");
        salarioBruto = sc.nextDouble();
        System.out.println("Digite a prestação:");
        valorPrestacao = sc.nextDouble();
        
        if ( valorPrestacao <= 0.3 * salarioBruto ) {
            System.out.println("Empréstimo concedido :]");
        } else {
            System.out.println("Empréstimo negado :(");
        }
        
    }
    
}
