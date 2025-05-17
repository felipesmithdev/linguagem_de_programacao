package sptech.school;
//
public class Ordenacao {
//    public static void selectionSort(int[]v){
//        for (int i = 0; i < v.length -1; i++){
//            for (int j = i + 1; j < v.length; j++){
//                if (v[j] < v[i]) {
//                    int aux = v[i];
//                    v[i] = v[j];
//                    v[j] = aux;
//                }
//            }
//        }
//    }
//
//    public static int selectionSortCorreto(int[]v){
//        int troca = 0;
//        for (int i = 0; i < v.length -1; i++){
//            int indMenor = i;
//            for (int j = i + 1; j < v.length; j++){
//                if (v[j] < v[indMenor]) {
//                    indMenor = j;
//                }
//            }
//            int aux = v[i];
//            v[i] = v[indMenor];
//            v[indMenor] = aux;
//            troca++;
//        }
//        return troca;
//    }
//
//    public static Integer quantasTrocas(int[]v){
//        Integer troca = 0;
//        for (int i = 0; i < v.length -1; i++){
//            for (int j = i + 1; j < v.length; j++){
//                if (v[j] < v[i]) {
//                    int aux = v[i];
//                    v[i] = v[j];
//                    v[j] = aux;
//                    troca++;
//                }
//            }
//        }
//        return troca;
//    }
//
//    public static void bubbleSort(int[]v){
//        for (int i = 0; i < v.length -1; i++){
//            for (int j = 1; j < v.length -i; j++){
//                if (v[j -1] > v[j]){
//                    int aux = v[j];
//                    v[j] = v[j-1];
//                    v[j - 1] = aux;
//                }
//            }
//        }
//    }
//
    public static int pesqBin(int []v, int x) {
        Integer inicio = 0;
        Integer fim = v.length - 1;

        while (inicio <= fim){
            int meio = (inicio + fim) / 2;

            if (x == v[meio]){
                return meio;
            } else if (x > v[meio]){
                inicio = meio +1;
            } else if (x < v[meio]){
                fim = meio -1;
            }
        }
        return -1;
    }
}
