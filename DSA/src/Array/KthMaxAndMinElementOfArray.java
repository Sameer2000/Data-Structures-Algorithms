// Find the "Kth" max and min element of an array 

package Array;
import java.util.Arrays;

public class KthMaxAndMinElementOfArray {
	
	public static int kthMin(int arr[], int k) {
		Arrays.sort(arr);
		return arr[k-1];
	}
	
	public static int kthMax(int arr[], int k) {
		Arrays.sort(arr);
		return arr[arr.length - k];
	}

	public static void main(String[] args) {

		int arr[] = {4,1,6,2,8,3,5,7};
		System.out.println("Third max. element is : " + kthMax(arr, 3));
		System.out.println("Fourth min. element is : " + kthMin(arr, 4));
		
	}

}
