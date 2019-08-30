package search;

import sort.InsertionSort;

/**
 *
 * @author DLT1CA
 */
public class Linear extends Search {

    private int numEscolhido, posicao = 0;
    private boolean achou = false;
    private int troca = 1;
    private int j = 0;

    public Linear(int n) {
        super(n);
    }

    public Linear() {
    }

    //<editor-fold defaultstate="collapsed" desc="getters and setters">
    public int getNumEscolhido() {
        return numEscolhido;
    }

    public void setNumEscolhido(int numEscolhido) {
        this.numEscolhido = numEscolhido;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public boolean isAchou() {
        return achou;
    }

    public void setAchou(boolean achou) {
        this.achou = achou;
    }

    public int getTroca() {
        return troca;
    }

    public void setTroca(int troca) {
        this.troca = troca;
    }
    //</editor-fold>

    public void findNumber() {
        i = 0;
        while (i < super.getN() && achou == false) {
            if (vet[i] == numEscolhido) {
                posicao = i;
                achou = true;
            }
            i++;
        }
    }

    public void findNumberSort() {
        //<editor-fold defaultstate="collapsed" desc="ordenando o vetor">
        i = 0;
        while (i < super.getN() && troca == 1) {
            troca = 0;
            for (j = 0; j < super.getN() - 1; j++) {
                if (vet[j] > vet[j + 1]) {
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                    troca = 1;
                }
            }
            i++;
        }
        //</editor-fold>
        i = 0;
        while (i < super.getN() && numEscolhido>=vet[i]){
            if (vet[i] == numEscolhido) 
            {
                posicao = i;
                achou = true;
            }
            i++;
        }

    }

}
