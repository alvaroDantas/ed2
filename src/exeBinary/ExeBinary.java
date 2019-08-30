package exeBinary;

import java.util.Scanner;
import search.Binary;

/**
 *
 * @author DLT1CA
 */
public class ExeBinary {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Quantidade de elementos ->");

        Binary ls = new Binary(s.nextInt());

        ls.lerVetor();

        System.out.println("Numero para busca");
        ls.setNumEscolhido(s.nextInt());

        ls.findNumber();

        if (ls.isAchou()) {
            System.out.println("Número " + ls.getNumEscolhido() + " encontrado na posição: " + ls.getPosicao());
        } else {
            System.out.println("Número não encontrado");
        }
        
        ls.maiorMenor();
        
        System.out.println("Maior número: "+ls.getMaior());
        System.out.println("Menor número: "+ls.getMenor());

    }
}
