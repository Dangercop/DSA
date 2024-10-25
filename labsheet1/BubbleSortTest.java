public class BubbleSortTest {
    public static void main(String[] args) {

        int[] numbers = {8, 3, 1, 4, 5, 11, 7, 2, 17, 13};


        System.out.println("Original array:");
        printArray(numbers);


        BubbleSort sorter = new BubbleSort();


        sorter.bubbleSort(numbers);


        System.out.println("Sorted array after swapping:");
        printArray(numbers);
    }


    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}