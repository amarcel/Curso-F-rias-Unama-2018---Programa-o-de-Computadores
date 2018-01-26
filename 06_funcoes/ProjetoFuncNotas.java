package projetofuncnotas;

import java.util.Scanner;

public class ProjetoFuncNotas {

    public static void main(String[] args) {
        double nota1, nota2, nota3, media;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a nota 1:");
        nota1 = sc.nextDouble();
        validarNota( nota1 );
        
        System.out.println("Digite a nota 2:");
        nota2 = sc.nextDouble();
        validarNota( nota2 );
        
        System.out.println("Digite a nota 3:");
        nota3 = sc.nextDouble();
        validarNota( nota3 );
        
        // calcular média (através de função)
        media = calcMedia(nota1, nota2, nota3);
        // definir APROVADO ou REPROVADO (através de função)
        imprimirResultado( media );
    } // fim do main
    
    static double calcMedia(double n1, double n2, 
            double n3) {
        double media = ( n1 + n2 + n3 ) / 3.0;
        return media;
    } // fim da calcMedia
    
    static void imprimirResultado( double media ) {
        if ( media > 7.0 ) {
            System.out.printf("APROVADO COM MÉDIA %.2f" 
                    , media);
        } else {
            System.out.printf("REPROVADO COM MÉDIA %.2f" 
                    , media);
        }
    }
    
    static void validarNota(double nota) {
        if( nota < 0.0 || nota > 10.0 ) {
            System.err.println("Nota inválida!");
            System.exit(0);
        }
    }
    
}
