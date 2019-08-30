/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search;

import java.util.Scanner;

/**
 *
 * @author DLT1CA
 */
public abstract class Search {

    Scanner scanner = new Scanner(System.in);
    private int n;
    int vet[];
    int aux;
    int i = 0;
    

    public Search(int n) {
        this.n = n;
        vet = new int[n];
    }

    public Search() {
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void lerVetor() {
        for (i = 0; i < n; i++) {
            System.out.println("Digite o " + (i + 1) + "º número");
            vet[i] = scanner.nextInt();
        }
    }

    public void apresentarVetor() {
        for (i = 0; i < n; i++) {
            System.out.println("Número: " + vet[i] + ", posição: " + i);
        }
    }
    
    

}
