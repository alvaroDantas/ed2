/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExeBubbleSort2;

import java.util.Scanner;
import search.Binary;
import sort.BubbleSort2;

/**
 *
 * @author ht3000974
 */
public class ExeBubbleSort2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Quantidade de elementos ->");

        BubbleSort2 bs2 = new BubbleSort2(s.nextInt());

        bs2.lerVetor();
        
        System.out.println("ASC(1) ou DESC(!= 1)");
        
        if(s.nextInt() == 1)
        {
            bs2.ordernarAsc();
        }
        else{
            bs2.ordernarDesc();
        }
        
        bs2.apresentarVetor();
        
    }
}
