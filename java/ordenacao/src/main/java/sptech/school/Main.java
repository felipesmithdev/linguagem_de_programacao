package sptech.school;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] v = {10, 20, 30, 40, 50, 60, 70, 80};
        int x = 50;
//        Integer[] lista2 = new Integer[9];
//        System.out.println(Ordenacao.selectionSortCorreto(v));
//        System.out.println(Arrays.toString(v));
//        Ordenacao.bubbleSort(v);
//        System.out.println(Arrays.toString(v));

        System.out.println(Ordenacao.pesqBin(v,x));
    }
}