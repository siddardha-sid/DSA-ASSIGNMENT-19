package problems;

public class Q6 {

	 public static int[] merge(int[] arr1, int[] arr2) {
	        int n1 = arr1.length;
	        int n2 = arr2.length;
	        int[] mergedArray = new int[n1 + n2];

	        int i = 0; // Pointer for arr1
	        int j = 0; // Pointer for arr2
	        int k = 0; // Pointer for the merged array

	        while (i < n1 && j < n2) {
	            if (arr1[i] <= arr2[j]) {
	                mergedArray[k] = arr1[i];
	                i++;
	            } else {
	                mergedArray[k] = arr2[j];
	                j++;
	            }
	            k++;
	        }

	        // Copy the remaining elements from arr1, if any
	        while (i < n1) {
	            mergedArray[k] = arr1[i];
	            i++;
	            k++;
	        }

	        // Copy the remaining elements from arr2, if any
	        while (j < n2) {
	            mergedArray[k] = arr2[j];
	            j++;
	            k++;
	        }

	        return mergedArray;
	    }

	    public static void main(String[] args) {
	        int[] arr1 = {1, 3, 4, 5};
	        int[] arr2 = {2, 4, 6, 8};
	        int[] result = merge(arr1, arr2);

	        System.out.print("Output: [");
	        for (int i = 0; i < result.length; i++) {
	            System.out.print(result[i]);
	            if (i != result.length - 1) {
	                System.out.print(", ");
	            }
	        }
	        System.out.println("]");
	        // Output: [1, 2, 3, 4, 4, 5, 6, 8]
	    }

}
