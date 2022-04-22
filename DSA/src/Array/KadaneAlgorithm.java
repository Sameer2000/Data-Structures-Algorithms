// find Largest sum contiguous Subarray [V. IMP]

package Array;

public class KadaneAlgorithm {
	
	public static long kadaneAlgorithm(int arr[], int n) {
		int max = 0;
		int subSum = 0;
		for(int i = 0; i < n; i++) {
			subSum += arr[i];
			max = Math.max(max, subSum);
			if(subSum < 0) {
				subSum = 0;
			}
		}
		return max;
	}

	public static void main(String[] args) {

		int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		System.out.println(kadaneAlgorithm(arr, arr.length));
		
	}

}
