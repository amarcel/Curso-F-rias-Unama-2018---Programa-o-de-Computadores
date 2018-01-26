package projetofuncmaiormenor;

import java.util.Scanner;

public class ProjetoFuncMaiorMenor {

    public static void main(String[] args) {
        int TAMANHO = 7;
        int[] vetor = new int[TAMANHO];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < TAMANHO; i++) {
            System.out.print("v["+i+"]: ");
            vetor[ i ] = sc.nextInt();
        }
        // chamar função para retornar MAIOR
        int maiorNumero = pegarMaiorNumero( vetor );
        // chamar função para retornar MENOR
        int menorNumero = pegarMenorNumero( vetor );
        
        System.out.println("Maior número: " + maiorNumero);
        System.out.println("Menor número: " + menorNumero);
    } // fim do main!
    
    static int pegarMaiorNumero(int[] v) {
        int maior = v[0];
        for(int i = 0 ; i < v.length ; i++) {
            if(v[ i ] > maior) {
                maior = v[ i ];
            }
        }
        return maior;
    } // fim do pegarMaiorNumero
    
    static int pegarMenorNumero(int[] v) {
        int menor = v[0];
        for(int i = 0 ; i < v.length ; i++) {
            if(v[ i ] < menor) {
                menor = v[ i ];
            }
        }
        return menor;
    } // fim do pegarMenorNumero
    
}
