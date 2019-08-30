package sort;

import java.util.Scanner;

/**
 *
 * @author DLT1CA
 */
public abstract class Sort {

    Scanner scanner = new Scanner(System.in);
    private int n;
    int vet[];
    int aux;
    int i = 0, j = 0;
    
    //construtor vazio
    public Sort() {
    }
    
    //construtor para inicializar a variavel n
    public Sort(int n) {
        this.n = n;
        vet = new int[n];
    }

    //<editor-fold defaultstate="collapsed" desc="getters and setters">
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    //</editor-fold>

    public void lerVetor(){
        for (i = 0; i < n; i++) {
            System.out.println("Digite o " + (i + 1) + "º número");
            vet[i] = scanner.nextInt();
        }
    }

    public abstract void ordernarAsc();

    public abstract void ordernarDesc();

    public void apresentarVetor(){
        for (i = 0; i < n; i++) {
            System.out.println("Número: " + vet[i] + ", posição: " + i);
        }
    }
}
