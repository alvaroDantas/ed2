package sort;

/**
 *
 * @author ht3000974
 */
public class MergeSort{
    public static void main(String[] args) {
        int vet[] = new int[]{1,3,5,2,4,6};
        int inicio = 0;
        int fim = vet.length-1;
        int meio = (inicio+fim)/2;
        
        
        vet = intercala(vet, inicio, fim, meio);
        
        for (int i = inicio; i <= fim; i++) {
            System.out.println(vet[i]);
        }
        
        
        

        
    }

    public static void merge(int vet[], int inicio, int fim){
        int meio;
        if(inicio<fim)
        {
            meio = (inicio+fim)/2;
            merge(vet, inicio, meio);
            merge(vet, meio+1, fim);
            intercala(vet, inicio, fim, meio);
        }
    }
    
    public static int[] intercala(int vet[], int inicio, int fim, int meio){
        int inicioVet1 = inicio, inicioVet2 = meio+1, i;
        int aux[] = new int[vet.length];
        int indiceVetorAux = inicio;
        
        while (inicioVet1 <= meio && inicioVet2 <=fim) {
            if(vet[inicioVet1] < vet[inicioVet2]){
                aux[indiceVetorAux] = vet[inicioVet1];
                inicioVet1++;
            }
            else{
                aux[indiceVetorAux] = vet[inicioVet2];
                inicioVet2++;
            }
            indiceVetorAux++;
        }
        
        for (i = inicioVet1;i<=meio;i++) {
            aux[indiceVetorAux] = vet[i];
            indiceVetorAux++;
        }
        
        for (i = inicioVet2;i<=fim;i++) {
            aux[indiceVetorAux] = vet[i];
            indiceVetorAux++;
        }
        
        return aux;
    }
}
