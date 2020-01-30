package de.kohnlehome.mergesort;

public class MergeSort implements IMergeSort {
    @Override
    public int[] sort(int[] array) {
        int length = array.length;

        if(length == 1){
            return array;
        }else{
            if(length == 2){
                int[] leftArray = new int [1];
                leftArray[0] = array[0];

                int[] rightArray = new int[1];
                rightArray[0] = array[1];

                return merge(leftArray, rightArray);
            }

        }
        int[] erg = new int[array.length]; //{1, 2, 3, 4, 5, 6, 7, 8};
        return erg;
    }

    private int[] merge(int[] leftArray, int[] rightArray) {
        return null;
    }
}
