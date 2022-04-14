// Find the maximum and minimum element in an array

package Array;

public class MinAndMaxInAnArray {
	
	static class pair{
		int min;
		int max;
	}
	
	// Time complexity -> O(n) & Space Complexity -> O(1)
	public static pair getMinMax(int arr[], int n) {
		pair ans = new pair();
		
		if(n == 1) {	
			ans.max = arr[0];
			ans.min = arr[0];
			return ans;
		}
		
		if(arr[0] > arr[1]) {
			ans.max = arr[0];
			ans.min = arr[1];
		}else {
			ans.min = arr[0];
			ans.max = arr[1];
		}
		
		for(int i = 2; i < n; i++) {
			if(arr[i] > ans.max) {
				ans.max = arr[i];
			}else if(arr[i] < ans.min) {
				ans.min = arr[i];
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		pair output = getMinMax(arr, arr.length);
		System.out.println("Min. element is : " + output.min);
		System.out.println("Max. element is : " + output.max);

	}

}
