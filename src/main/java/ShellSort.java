public class ShellSort {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        /*
        the first loop is going to initialize the gap value,
        and reduce it after each iteration
         */
        for (int gap = intArray.length/2; gap > 0; gap /= 2){


            for (int i = gap; i < intArray.length; i++){
                int newElement = intArray[i];
                int j = i;

                while (j >= gap && intArray[j - gap] > newElement){
                    intArray[j] = intArray[j-gap];
                    j -= gap;
                }

                intArray[j] = newElement;

            }

        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }
}
