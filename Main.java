
package com.example.insertionsort.insertionsort;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            //save the value of the element we are going to insert
            int newElement = intArray[firstUnsortedIndex];
            int i;

            //loop that does the traversal of the sorted partition and looks for the correct position to insert the new element
            for(i = firstUnsortedIndex; i > 0 && intArray[i-1] > newElement; i--) {
                //sorting left to right
                intArray[i] = intArray[i-1];
            }

            intArray[i] = newElement;
        }
;        for (int i=0; i<intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
