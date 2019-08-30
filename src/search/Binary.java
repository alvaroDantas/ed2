/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search;

/**
 *
 * @author DLT1CA
 */
public class Binary extends Search {

    public Binary(int n) {
        super(n);
        maior = vet[0];
        menor = vet[0];
    }

    public Binary() {
    }

    private int numEscolhido;
    private int posicao = 0;
    private boolean achou = false;
    private int eleito = 1;
    private int maior;
    private int menor;
    private int inicio = vet[0];
    private int meio = 0;
    private int fim = super.getN() - 1;
    private int j = 0;
    
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

    public int getEleito() {
        return eleito;
    }

    public void setEleito(int eleito) {
        this.eleito = eleito;
    }

    public int getMaior() {
        return maior;
    }

    public void setMaior(int maior) {
        this.maior = maior;
    }

    public int getMenor() {
        return menor;
    }

    public void setMenor(int menor) {
        this.menor = menor;
    }

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public int getMeio() {
        return meio;
    }

    public void setMeio(int meio) {
        this.meio = meio;
    }

    public int getFim() {
        return fim;
    }

    public void setFim(int fim) {
        this.fim = fim;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }
    //</editor-fold>
    
    public void findNumber() {
        i = 0;
        //<editor-fold defaultstate="collapsed" desc="ordenação do vetor">
        for (i = 1; i < super.getN(); i++) {
            eleito = vet[i];
            j = i - 1;
            while (j >= 0 && vet[j] > eleito) {
                vet[j + 1] = vet[j];
                j--;
            }
            vet[j + 1] = eleito;
        }
        //</editor-fold>
        
        //<editor-fold desc="buscando número">
        while (inicio <= fim && !achou){
            meio = (inicio+fim)/2;
            if(numEscolhido == vet[meio]){
                achou = true;
                posicao = meio;
            }
            else if(numEscolhido>vet[meio]){
                inicio = meio+1;
            }
            else{
                fim = meio-1;
            }
            
        }
        //</editor-fold>
    }
    
    public void maiorMenor(){
        for (i = 0; i < super.getN(); i++) {
            if(vet[i]<menor)
            {
                menor = vet[i];
            }
            if(vet[i]>maior)
            {
                maior = vet[i];
            }
        }
    }
}
