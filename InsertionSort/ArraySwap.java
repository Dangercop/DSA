import java.util.Arrays;

public class ArraySwap {
    
    static Integer[] array = {5, 2, 4, 6, 1, 3}; 
    static int outerIndex;
    
    
    public static void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
  
    public static void insert(int endIndex) {
        int i = endIndex;
        
        while (i > 0 && array[i] < array[i - 1]) {
            swap(i, i - 1);
            System.out.println("i: " + i + ", j: " + (i - 1) + ", Array State: " + Arrays.deepToString(array));
            i--;
        }
    }
    
    
    public static void insertionSort() {
        for (int i = 1; i < array.length; i++) {
            insert(i);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Initial Array: " + Arrays.deepToString(array));
        insertionSort();
        System.out.println("Sorted Array: " + Arrays.deepToString(array));
    }
}