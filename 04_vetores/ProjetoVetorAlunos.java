package projetovetoralunos;

import java.util.Scanner;

public class ProjetoVetorAlunos {

    public static void main(String[] args) {
        int TAMANHO = 5;
        String[] nomes  = new String[TAMANHO];
        double[] notas1 = new double[TAMANHO];
        double[] notas2 = new double[TAMANHO];
        double[] medias = new double[TAMANHO];
        
        Scanner sc = new Scanner(System.in);
        for ( int i = 0 ; i < TAMANHO ; i++ ) {
            System.out.println("# Aluno " + (i+1) + " #");
            System.out.println("Digite o nome:");
            nomes[ i ] = sc.next(); // bug
            System.out.println("Digite a nota 1:");
            notas1[ i ] = sc.nextDouble();
            System.out.println("Digite a nota 2:");
            notas2[ i ] = sc.nextDouble();
            medias[ i ] = 
                    ( notas1[ i ] + notas2[ i ] ) / 2.0;
        } // fim do for 1
        
        System.out.println("### RESULTADO ###");
        double somaTotal = 0.0;
        for ( int i = 0 ; i < TAMANHO ; i++ ) {
            System.out.println(nomes[ i ] + ":\t" 
                    + notas1[i] + " / " + notas2[i] 
                    + " / MÉDIA: " + medias[i]);
            somaTotal = somaTotal + medias[i];
        } // FIM DO FOR DE SAÍDA
        System.out.println( "### MÉDIA DA TURMA: " 
                + (somaTotal / TAMANHO) );
        
    }
    
}
