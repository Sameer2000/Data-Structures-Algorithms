// Find the Union and Intersection of the two sorted arrays.

package Array;

public class UnionAndIntersectionOfTwoSortedArrays {
	
	// Time Complexity -> O(m+n)
	public static void intersection(int[] arr1, int[] arr2) {
		int i = 0, j = 0;
		while(i < arr1.length && j < arr2.length) {
			if(arr1[i] == arr2[j]) {
				System.out.print(arr1[i]+ " ");
				i++;
				j++;
			}else if(arr1[i] < arr2[j]) {
				i++;
			}else {
				j++;
			}
		}
	}
	
	// Time complexity -> O(m+n)
	public static void union(int arr1[], int arr2[]) {
		int m = arr1.length, n = arr2.length;
		int i = 0, j = 0, k = 0;
		while(i < m && j < n) {
			if(arr1[i] < arr2[j]) {
				System.out.print(arr1[i]+" ");
				i++;
			}else if(arr2[j] < arr1[i]){
				System.out.print(arr2[j]+" ");
				j++;
			}else {
				System.out.print(arr1[i]+" ");
				i++;
				j++;
			}
		}
		while(i < m) {
			System.out.print(arr1[i]+" ");
			i++;
		}
		while(j < n) {
			System.out.print(arr2[j]+" ");
			j++;
		}
	}

	public static void main(String[] args) {
		
		int arr1[] = {1,2,3,5,6,8};
		int arr2[] = {5,7,8,9,12,43};
		
		intersection(arr1, arr2);
		
		System.out.println();
		
		union(arr1, arr2);

	}

}
