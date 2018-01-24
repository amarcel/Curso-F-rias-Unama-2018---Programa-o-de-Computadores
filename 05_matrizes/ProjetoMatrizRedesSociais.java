package projetomatrizredessociais;

import java.util.Scanner;

public class ProjetoMatrizRedesSociais {

    public static void main(String[] args) {
        int LINHAS = 7, COLUNAS = 3;
        double[][] M = new double[LINHAS][COLUNAS];
        double somaSemana = 0.0, somaFace = 0.0, 
                somaTwitter = 0.0, somaWhatsapp = 0.0,
                mediaQuinta = 0.0, mediaSabado = 0.0;
        
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < LINHAS; i++) {
            for (int j = 0; j < COLUNAS; j++) {
                System.out.print("M["+i+"]["+j+"] = ");
                M[i][j] = sc.nextDouble();
                somaSemana = somaSemana + M[i][j];
                if( j == 0 )
                    somaFace = somaFace + M[i][j];
                if( j == 1 )
                    somaTwitter = somaTwitter + M[i][j];
                if( j == 2 )
                    somaWhatsapp = somaWhatsapp + M[i][j];
            }
        }
        
        mediaQuinta = (M[3][0] + M[3][1] + M[3][2]) 
                / COLUNAS;
        mediaSabado = (M[5][0] + M[5][1] + M[5][2]) 
                / COLUNAS;
        
        System.out.println("# MATRIZ #");
        for (int i = 0; i < LINHAS; i++) {
            for (int j = 0; j < COLUNAS; j++) {
                System.out.print(M[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("# RESULTADOS #");
        System.out.println("Facebook:\t" + somaFace);
        System.out.println("Twitter:\t" + somaTwitter);
        System.out.println("Whatsapp:\t" + somaWhatsapp);
        System.out.println("Total:\t" + somaSemana);
        System.out.println("Média quinta-feira:\t" + mediaQuinta);
        System.out.println("Média sábado:\t" + mediaSabado);
    }
    
}
