
package p05placarfutebol;

import java.util.Scanner;

public class P05PlacarFutebol {

    public static void main(String[] args) {
        String nomeTimeA, nomeTimeB;
        int golsA, golsB;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nome do time A:");
        nomeTimeA = sc.nextLine();
        System.out.println("Nome do time B:");
        nomeTimeB = sc.nextLine();
        System.out.println("Gols do " + nomeTimeA);
        golsA = sc.nextInt();
        System.out.println("Gols do " + nomeTimeB);
        golsB = sc.nextInt();
        
        if ( golsA > golsB ) {
            System.out.println(nomeTimeA 
                    + " venceu "  + nomeTimeB);
        } else if ( golsB > golsA ) {
            System.out.println(nomeTimeB 
                    + " venceu "  + nomeTimeA);
        } else {
            System.out.println(nomeTimeA 
                    + " empatou com "  + nomeTimeB);
        }
        System.out.println("Placar:");
        System.out.println(nomeTimeA + " " + golsA 
                + " x " + golsB + " " + nomeTimeB);
        
    } // fim do main!
    
}
