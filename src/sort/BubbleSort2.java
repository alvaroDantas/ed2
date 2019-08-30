package sort;

/**
 *
 * @author DLT1CA
 */
public class BubbleSort2 extends Sort{

    public BubbleSort2() {
    }

    public BubbleSort2(int n) {
        super(n);
    }

    @Override
    public void ordernarAsc() {
        for (i = 1; i < super.getN(); i++) {
                for (j = (super.getN()-1); j >= i; j--) {
                    if (vet[j] < vet[j - 1]) {
                        aux = vet[j];
                        vet[j] = vet[j - 1];
                        vet[j - 1] = aux;
                    }
                }
            }
    }

    @Override
    public void ordernarDesc() {
        for (i = 1; i < super.getN(); i++) {
                for (j = (super.getN()-1); j >= i; j--) {
                    if (vet[j] > vet[j - 1]) {
                        aux = vet[j];
                        vet[j] = vet[j - 1];
                        vet[j - 1] = aux;
                    }
                }
            }
    }
}
