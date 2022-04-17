// Move all the negative elements to one side of the array

package Array;

public class RearrangeNegativePositiveElements {

	public static void rearrange(int arr[], int n) {
		int j = 0;
		for(int i = 0; i < n; i++) {
			if(arr[i] < 0) {
				if(i != j) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j++;
			}
		}
	}

	public static void main(String[] args) {

		int arr[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9 };
		rearrange(arr, arr.length);

		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
