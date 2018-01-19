
package projetoanimal;

import java.util.Scanner;

public class ProjetoAnimal {

    public static void main(String[] args) {
        String info1, info2, info3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informação 1:");
        info1 = sc.nextLine();
        System.out.println("Informação 2:");
        info2 = sc.nextLine();
        System.out.println("Informação 3:");
        info3 = sc.nextLine();
        
        if ( info1.equalsIgnoreCase("vertebrado") ) {
            if ( info2.equalsIgnoreCase("ave") ) {
                if ( info3.equalsIgnoreCase("carnivoro") )
                    System.out.println("aguia");
                else if( info3.equalsIgnoreCase("onivoro") ) 
                    System.out.println("pomba");
            } else if ( info2.equalsIgnoreCase("mamifero") ) {
                if( info3.equalsIgnoreCase("onivoro") )
                    System.out.println("homem");
                else if (info3.equalsIgnoreCase("herbivoro") )
                    System.out.println("vaca");
            }
        } else if (info1.equalsIgnoreCase("invertebrado") ) {
            if ( info2.equalsIgnoreCase("inseto") ) {
                if( info3.equalsIgnoreCase("hematofago") )
                    System.out.println("pulga");
                else if(info3.equalsIgnoreCase("herbivoro") )
                    System.out.println("lagarta");
            } else if ( info2.equalsIgnoreCase("anelideo") ){
                if( info3.equalsIgnoreCase("hematofago") )
                    System.out.println("sanguessuga");
                else if(info3.equalsIgnoreCase("onivoro") )
                    System.out.println("minhoca");
            }
        }
        
        
        
    }
    
}
