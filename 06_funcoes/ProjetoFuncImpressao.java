package projetofuncimpressao;
public class ProjetoFuncImpressao {

    public static void main(String[] args) {
        imprimirLinha("*");
        System.out.println("PROGRAMAÇÃO");
        imprimirLinha("=");
        System.out.println("DE SISTEMAS");
        imprimirLinha("#");
    } // fim do main!
    
    static void imprimirLinha(String c){
        for ( int i = 0 ; i < 12 ; i++) {
            System.out.print( c );
        }
        System.out.println("");
    }
    
}
