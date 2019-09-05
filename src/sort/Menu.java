/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

import java.util.Scanner;

/**
 *
 * @author DLT1CA
 */
public class Menu {
    public static void main(String[] args) {
        int opc = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Escolha um dos exercícios (1 até 5)");
        
        opc = s.nextInt();
        
        switch (opc) {
            case 1:
                break;
            case 2:
                Exercicio2 exe2 = new Exercicio2();
                break;
            case 3:
                break;
            default:
                break;
        }
    }
}
