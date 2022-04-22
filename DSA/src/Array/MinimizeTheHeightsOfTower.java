// Minimise the maximum difference between heights [V.IMP]

package Array;

public class MinimizeTheHeightsOfTower {
	
	public static int minimizeHeight(int[] arr, int n, int k) {
		int max, min;
		int result = arr[n-1] - arr[0];
		
		for(int i = 1; i < n; i++) {
			if(arr[i] - k >= 0) {
				max = Math.max(arr[i-1] + k, arr[n-1] - k);
				min = Math.min(arr[0] + k, arr[i] - k);
			    result = Math.min(result, max - min);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		
		int arr[] = {3,9,12,16,20};
		System.out.println(minimizeHeight(arr, arr.length, 3));

	}

}
