package sort;

/**
 *
 * @author DLT1CA
 */
public class InsertionSort extends Sort {

    private int eleito = 0;

    public InsertionSort() {
    }

    public InsertionSort(int n) {
        super(n);
    }
    
    

    @Override
    public void ordernarAsc() {
        for (i = 1; i < super.getN(); i++) {
            eleito = vet[i];
            j = i - 1;
            while (j >= 0 && vet[j] > eleito) {
                vet[j + 1] = vet[j];
                j--;
            }
            vet[j + 1] = eleito;
        }
    }

    @Override
    public void ordernarDesc() {
        for (i = 1; i < super.getN(); i++) {
            eleito = vet[i];
            j = i - 1;
            while (j >= 0 && vet[j] < eleito) {
                vet[j + 1] = vet[j];
                j--;
            }
            vet[j + 1] = eleito;
        }
    }

}
