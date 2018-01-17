package projetoferias05;

import java.util.Scanner;

public class ProjetoFerias05 {

    public static void main(String[] args) {

        double preco, desc, pf;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o preço:");
        preco = sc.nextDouble();

        System.out.println("Informe o desconto");
        desc = sc.nextDouble();

        //pf = preco - (preco * desc) / 100;
        pf = preco * (100 - desc) / 100;

        System.out.println("Valor produto com desc:" + pf);
    }
}
