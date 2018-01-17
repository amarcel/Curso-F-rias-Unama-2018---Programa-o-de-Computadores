
package projetolataoleo;

import java.util.Scanner;

public class ProjetoLataOleo {

    public static void main(String[] args) {
        double volume, altura, raio;
        Scanner sc = new Scanner(System.in);
        System.out.println("Altura da lata:");
        altura = sc.nextDouble();
        System.out.println("Raio da lata:");
        raio   = sc.nextDouble();
        
        if ( altura > 0.0 && raio > 0.0 ) {
            volume = Math.PI * Math.pow(raio, 2) * altura;
            System.out.println("Volume da lata: " + volume);
        } else {
            System.err.println("Valor de altura ou "
                    + "raio inválido.");
            System.err.println("Valores negativos ou "
                    + "nulos foram informados");
        }
        
    } // fim do main!
    
}
