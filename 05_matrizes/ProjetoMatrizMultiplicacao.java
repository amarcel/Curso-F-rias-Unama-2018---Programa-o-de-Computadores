package projetomatrizmultiplicacao;

import java.util.Scanner;

public class ProjetoMatrizMultiplicacao {

    public static void main(String[] args) {
        int LINHAS = 3, COLUNAS = 4;
        double[][] A = new double[LINHAS][COLUNAS];
        double[][] B = new double[LINHAS][COLUNAS];
        
        Scanner sc = new Scanner(System.in);
        
        for ( int i = 0; i < LINHAS; i++ ) {
            for ( int j = 0; j < COLUNAS; j++ ) {
                System.out.print("A["+i+"]"
                +"["+j+"] = ");
                A[i][j] = sc.nextDouble();
                B[i][j] = A[i][j] * 3;
            }
        }
        
        System.out.println("### MATRIZ B ###");
        for (int i = 0; i < LINHAS; i++) {
            for (int j = 0; j < COLUNAS; j++) {
                System.out.print( B[i][j] + "\t");
            } // for de colunas
            System.out.println("");
        } // for de linhas
        
        
    }
    
}
