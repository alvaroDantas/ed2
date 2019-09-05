package sort;

/**
 *
 * @author DLT1CA
 */

public class Exercicio2 {

    private int maior;
    private int menor;
    private int qtdMaior;
    private int qtdMenor;
    
    public Exercicio2() {

        System.out.println("_____Exercício 2_____");
        InsertionSort is = new InsertionSort(10);
        
        maior = is.vet[0];
        menor = Integer.MAX_VALUE;

        is.lerVetor();

        is.ordernarAsc();

        is.apresentarVetor();
        
        for (is.i = 0; is.i < is.getN(); is.i++) {
            if(is.vet[is.i]<menor)
            {
                menor = is.vet[is.i];
            }
            if(is.vet[is.i]>maior)
            {
                maior = is.vet[is.i];
            }
        }
        
        for (is.i = 0; is.i < is.getN(); is.i++){
            if(maior == is.vet[is.i]){
                qtdMaior++;
            }
            if(menor == is.vet[is.i])
            {
                qtdMenor++;
            }
        }
        
        System.out.println("Maior número: "+maior+", repetições: "+qtdMaior);
        System.out.println("Menor número: "+menor+", repetições: "+qtdMenor);
        
        
    }
    
    //<editor-fold defaultstate="collapsed" desc="getters and setters">
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
    //</editor-fold>
    

}
