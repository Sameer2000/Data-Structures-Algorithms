// Cyclically rotate an array by one

package Array;

public class RotateArrayByOne {
	
	public static void rotateByOne(int[] arr, int n) {
		int temp = arr[n-1];
		for(int i = n-1; i >= 1; i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = temp;
	}

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5};
		rotateByOne(arr, arr.length);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
