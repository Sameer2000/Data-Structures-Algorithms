// Minimum no. of Jumps to reach end of an array

package Array;

public class MinJumps {
	
	public static int minJumps(int arr[], int n) {
		if(n == 1) return 0;
		
		if(arr[0] == 0) return -1;
		
		if(arr[0] > 1) return 1;
		
		int maxReachable = arr[0];
		int stepsPossible = arr[0];
		int jumps = 1;
		
		for(int i = 1; i < n; i++) {
			if(i == n - 1) return jumps;
			
			maxReachable = Math.max(maxReachable, i + arr[i]);
			stepsPossible--;
			
			if(stepsPossible == 0) {
				jumps++;
				if(i >= maxReachable) return -1;
				
				stepsPossible = maxReachable - i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		int arr[] = {1,3,5,8,9,2,6,7,6,8,9};
		System.out.println(minJumps(arr, arr.length));

	}

}
