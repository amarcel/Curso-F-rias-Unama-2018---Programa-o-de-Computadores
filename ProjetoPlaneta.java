
package projetoplaneta;

import java.util.Scanner;

public class ProjetoPlaneta {

    public static void main(String[] args) {
        // declaração de variáveis
        double pesoTerra, pesoPlaneta, gravidade;
        String nomePlaneta;
        // entrada de dados
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o peso na Terra:");
        pesoTerra = sc.nextDouble();
        
        if ( pesoTerra <= 0.0 ) {
            System.err.println("Valor de peso inválido.");
            System.err.println("Informou valor zero ou negativo.");
            System.exit(0);
        }
        
        System.out.println("Digite o planeta:");
        System.out.println("(mercúrio, vênus, marte, "
                + "júpiter, saturno, urano)");
        nomePlaneta = sc.next().trim();
        
        // processamento
        if(nomePlaneta.equalsIgnoreCase("mercúrio")){
            gravidade = 0.37;
        } else if(nomePlaneta.equalsIgnoreCase("vênus")) {
            gravidade = 0.88;
        } else if(nomePlaneta.equalsIgnoreCase("marte")) {
            gravidade = 0.38;
        } else if(nomePlaneta.equalsIgnoreCase("júpiter")) {
            gravidade = 2.64;
        } else if(nomePlaneta.equalsIgnoreCase("saturno")){
            gravidade = 1.15;
        } else if(nomePlaneta.equalsIgnoreCase("urano")){
            gravidade = 1.17;
        } else {
            gravidade = 0.0;
            System.err.println("Nome do planeta inválido.");
            System.exit(0); // encerra o programa!
        }
        
        pesoPlaneta = (pesoTerra / 10.0) * gravidade;
        
        // saída de dados
        System.out.println("Peso em " + nomePlaneta + ": " +
                pesoPlaneta + " kg");
    } // fim do main!
    
}
