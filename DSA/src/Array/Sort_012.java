// Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo

package Array;

public class Sort_012 {
	
	public static void sort012(int[] arr, int n) {
		
		int start = 0, mid = 0, pivot = 1, end = n-1, temp;
		
		while(mid <= end) {
			if(arr[mid] < pivot) {
				temp = arr[start];
				arr[start] = arr[mid];
				arr[mid] = temp;
				++start;
				++mid;
			}else if(arr[mid] > pivot) {
				temp = arr[end];
				arr[end] = arr[mid];
				arr[mid] = temp;
				end--;
			}else {
				mid++;
			}
		}
		
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

	public static void main(String[] args) {
		
		int arr[] = {1,2,0,1,2,1,0,0,2,2,0,1};
		sort012(arr, arr.length);

	}

}
