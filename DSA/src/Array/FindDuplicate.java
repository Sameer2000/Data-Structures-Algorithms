// find duplicate in an array of N+1 Integers

package Array;

public class FindDuplicate {
	
	public static int findDuplicate(int arr[]) {
		int n = arr.length;
		for(int num : arr) {
			int i = Math.abs(num);
			if(arr[i] < 0) {
				return i;
			}
			arr[i] = -arr[i];
		}
		return n;
	}

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,1,4};
		System.out.println(findDuplicate(arr));

	}

}
