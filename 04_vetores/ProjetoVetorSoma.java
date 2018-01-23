package projetovetorsoma;

import java.util.Scanner;

public class ProjetoVetorSoma {

    public static void main(String[] args) {
        int TAMANHO = 7;
        double[] v1 = new double[TAMANHO];
        double[] v2 = new double[TAMANHO];
        double[] soma = new double[TAMANHO];
        
        Scanner sc = new Scanner(System.in);
        for ( int i = 0 ; i < TAMANHO ; i++ ) {
            System.out.print("v1[" + i + "] = ");
            v1[i] = sc.nextDouble();
            System.out.print("v2[" + i + "] = ");
            v2[i] = sc.nextDouble();
            soma[i] = v1[i] + v2[i];
        }
        
        System.out.println("### SAÍDA ###");
        for ( int i = 0 ; i < TAMANHO ; i++ ){
            System.out.print( v1[i] + ";\t");
        }
        System.out.println("");
        for ( int i = 0 ; i < TAMANHO ; i++ ){
            System.out.print( v2[i] + ";\t");
        }
        System.out.println("");
        for ( int i = 0 ; i < TAMANHO ; i++ ){
            System.out.print( soma[i] + ";\t");
        }
        
    }
    
}
