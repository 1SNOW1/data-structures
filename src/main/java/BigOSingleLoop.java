public class BigOSingleLoop {

    public static void main(String[] args) {
        int numberOfOperations = 0;
        int n=100; //size of data
        long startTime;
        long endTime;

        System.out.println("Input size n is = " + n);

        // Task 1 Single Loop ........................
        startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            numberOfOperations =+ 1;
        }

        endTime = System.currentTimeMillis();

    }
}
