/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

/**
 *
 * @author ht3000974
 */
public class SelectionSort extends Sort{

    private int eleito = 0;
    private int menor = 0;
    private int idMenor = 0;

    public int getIdMenor() {
        return idMenor;
    }

    public void setIdMenor(int idMenor) {
        this.idMenor = idMenor;
    }

    public int getMenor() {
        return menor;
    }

    public void setMenor(int menor) {
        this.menor = menor;
    }

    public SelectionSort() {
    }

    public SelectionSort(int n) {
        super(n);
    }

    public int getEleito() {
        return eleito;
    }

    public void setEleito(int eleito) {
        this.eleito = eleito;
    }
    
    
    
    @Override
    public void ordernarAsc() {
        for (i = 0; i < super.getN()-1; i++) {
            eleito = vet[i];
            menor = vet[i];
            idMenor = i+1;
            for (j = i+2; j < super.getN()-1; j++) {
                if(vet[j]<menor){
                    menor = vet[j];
                    idMenor = j;
                }
                if(menor < eleito){
                    vet[i] = vet[idMenor];
                    vet[idMenor] = eleito;
                }
            }
        }
    }

    @Override
    public void ordernarDesc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
