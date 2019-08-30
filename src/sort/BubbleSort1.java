package sort;

/**
 *
 * @author DLT1CA
 */
public class BubbleSort1 extends Sort {

    public BubbleSort1() {
    }

    public BubbleSort1(int n) {
        super(n);
    }

    @Override
    public void ordernarAsc() {
        for (i = 0; i < super.getN(); i++) {
            for (j = 0; j < super.getN() - 1; j++) {
                if (vet[j] > vet[j + 1]) {
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
        }
    }

    @Override
    public void ordernarDesc() {
        for (i = 0; i < super.getN(); i++) {
            for (j = 0; j < super.getN() - 1; j++) {
                if (vet[j] < vet[j + 1]) {
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
        }
    }
}
