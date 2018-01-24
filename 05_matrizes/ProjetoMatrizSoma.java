package projetomatrizsoma;

import java.util.Scanner;

public class ProjetoMatrizSoma {

    public static void main(String[] args) {
        int LINHAS = 3, COLUNAS = 3;
        int[][] x = new int[LINHAS][COLUNAS];
        int[][] y = new int[LINHAS][COLUNAS];
        int[][] s = new int[LINHAS][COLUNAS];
        
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < LINHAS; i++) {
            for (int j = 0; j < COLUNAS; j++) {
                System.out.println("x["+i+"]["+j+"] = ");
                x[i][j] = sc.nextInt();
                System.out.println("y["+i+"]["+j+"] = ");
                y[i][j] = sc.nextInt();
                s[i][j] = x[i][j] + y[i][j];
            }
        }
        
        int somaTotal = 0, somaLinha1 = 0, somaUltCol = 0;
        for (int i = 0; i < LINHAS; i++) {
            for (int j = 0; j < COLUNAS; j++) {
                somaTotal = somaTotal + s[i][j];
                if ( i == 0 ) {
                    somaLinha1 = somaLinha1 + s[i][j];
                }
                if ( j == COLUNAS-1 ) {
                    somaUltCol = somaUltCol + s[i][j];
                }
            }
        }
        System.out.println("# MATRIZ SOMA #");
        for (int i = 0; i < LINHAS; i++) {
            for (int j = 0; j < COLUNAS; j++) {
                System.out.print(s[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("# SOMATÓRIOS #");
        System.out.println("Soma Total: " + somaTotal);
        System.out.println("Soma 1ª linha: " + somaLinha1);
        System.out.println("Soma última coluna: " + somaUltCol);
        
    }
    
}
