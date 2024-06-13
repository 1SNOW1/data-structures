public class SelectionSort {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        /*
        The first loop below is the outer loop, it is increasing the sorted partition by 1,
        it's growing it from right to left
         */


            /*
            the inner loop below is the one looking for the largest element
             */
            for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

                int largest = 0;

                for (int i = 1; i <= lastUnsortedIndex; i++) {
                    if (intArray[i] > intArray[largest]) {
                        largest = i;
                    }
                }

                /*
                once we have looked through every element, and we have found the largest element,
                now it's time to swap the largest element with the last element in the unsorted partition
                 */
                swap(intArray, largest, lastUnsortedIndex);


            }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        }

    public static void swap( int[] array, int i, int j){

        if (i == j){
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
