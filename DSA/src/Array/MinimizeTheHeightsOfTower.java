// Minimise the maximum difference between heights [V.IMP]

package Array;

import java.util.Arrays;

public class MinimizeTheHeightsOfTower {
	
	public static int minimizeHeight(int[] A, int K) {
		int n = A.length;
        Arrays.sort(A);
        int ans = A[n - 1] - A[0];
        int minimum = A[0] + K;
        int maximum = A[n - 1] - K;
        int current_minimum = 0, current_maximum = 0;
        for (int i = 0; i < n - 1; i++)
        {
            // Finding the minimum and the maximum value if we perform the decrement operation on all the
            // indexes greater than index i and increment operation until the index i.
            current_minimum = Math.min(A[i + 1] - K, minimum);
            current_maximum = Math.max(A[i] + K, maximum);
            // Checking if minimum value is non-negative or not.
            if (current_minimum >= 0)
            {
                ans = Math.min(ans, current_maximum - current_minimum);
            }
        }
        return ans;
	}

	public static void main(String[] args) {
		
		int arr[] = {3,9,12,16,20};
		System.out.println(minimizeHeight(arr, 3));

	}

}
