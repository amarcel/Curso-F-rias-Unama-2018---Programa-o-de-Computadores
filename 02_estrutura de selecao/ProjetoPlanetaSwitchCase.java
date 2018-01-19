
package projetoplanetaswitchcase;

import java.util.Scanner;

public class ProjetoPlanetaSwitchCase {

    public static void main(String[] args) {
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
        switch(nomePlaneta) {
            case "mercúrio": gravidade = 0.37; break;
            case "vênus":    gravidade = 0.88; break;
            case "marte":    gravidade = 0.38; break;
            case "júpiter":  gravidade = 2.64; break;
            case "saturno":  gravidade = 1.15; break;
            case "urano":    gravidade = 1.17; break;
            default:
                gravidade = 0.0;
                System.err.println("Nome do planeta inválido.");
                System.exit(0); // encerra o programa!
        }
        
        pesoPlaneta = (pesoTerra / 10.0) * gravidade;
        
        // saída de dados
        System.out.println("Peso em " + nomePlaneta + ": " +
                pesoPlaneta + " kg");
    }
    
}
