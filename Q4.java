package problems;

public class Q4 {

	public static void moveZerosToEnd(int[] arr) {
        int n = arr.length;
        int nonZeroIndex = 0;

        
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex] = arr[i];
                nonZeroIndex++;
            }
        }

      
        while (nonZeroIndex < n) {
            arr[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        moveZerosToEnd(arr);

        System.out.print("Output: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
       
    }

}
