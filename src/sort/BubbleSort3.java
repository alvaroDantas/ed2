package sort;

/**
 *
 * @author DLT1CA
 */
public class BubbleSort3 extends Sort {

    private int troca = 1;

    public BubbleSort3() {
    }

    public BubbleSort3(int n) {
        super(n);
    }

    @Override
    public void ordernarAsc() {
        i = 0;
        while (i < super.getN() && troca == 1) {
            troca = 0;
            for (j = 0; j < (super.getN() - 1); j++) {
                if (vet[j] > vet[j + 1]) {
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                    troca = 1;
                }
            }
            i++;
        }
    }

    @Override
    public void ordernarDesc() {
        i = 0;
        while (i<super.getN() && troca==1) {
                troca = 0;
                for (j = 0; j < (super.getN()) - 1; j++) {
                    if (vet[j] < vet[j + 1]) {
                        aux = vet[j];
                        vet[j] = vet[j + 1];
                        vet[j + 1] = aux;
                        troca =1;
                    }
                }
                i++;
            }
    }

}
