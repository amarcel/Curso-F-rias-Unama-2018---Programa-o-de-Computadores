
package projetogorjeta;

import java.util.Scanner;

public class ProjetoGorjeta {

    public static void main(String[] args) {
        double conta, contaGorjeta;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o valor da conta:");
        conta = sc.nextDouble();
        
        if ( conta > 0 ) {
            contaGorjeta = conta * 1.1;
            System.out.printf("Valor da conta "
                    + "com gorjeta: %.2f", contaGorjeta);
        } else {
            System.err.println("Valor da conta inválido.");
            System.err.println("Não pode ser negativa ou nula.");
        }
        
    }
    
}
