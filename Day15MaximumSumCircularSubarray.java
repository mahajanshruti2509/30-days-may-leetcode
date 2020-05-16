/**
 * Maximum Sum Circular Subarray
 *
 * Given a circular array C of integers represented by A, find the maximum possible sum of a non-empty subarray of C.
 *
 * Here, a circular array means the end of the array connects to the beginning of the array.  (Formally, C[i] = A[i]
 * when 0 <= i < A.length, and C[i+A.length] = C[i] when i >= 0.)
 *
 * Also, a subarray may only include each element of the fixed buffer A at most once.  (Formally, for a subarray C[i], C[i+1], ..., C[j],
 * there does not exist i <= k1, k2 <= j with k1 % A.length = k2 % A.length.)
 *
 * */

class Solution {
  public int maxSubarraySumCircular(int[] A) {
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int currMax = 0;
    int currMin = 0;
    int total = 0;

    for(int i =0; i < A.length; i++) {
      currMax = currMax +A[i];
      max = Math.max(max, currMax);
      currMax = Math.max(currMax, 0);

      currMin = currMin +A[i];
      min = Math.min(min, currMin);
      currMin = Math.min(currMin, 0);

      total = total + A[i];
    }

    if(max < 0) {
      return max;
    }
    return Math.max(max, total - min);
  }
}