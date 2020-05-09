/**
 * Valid Perfect Square
 *
 * Given a positive integer num, write a function which returns True if num is a perfect square else False.
 *
 * Note: Do not use any built-in library function such as sqrt.
 *
 * Example 1:
 *
 * Input: 16
 * Output: true
 * Example 2:
 *
 * Input: 14
 * Output: false
 *
 * */

class Solution {
  public boolean isPerfectSquare(int num) {
    if(num < 2) {
      return true;
    }

    long start = 2;
    long end = num/2;

    while(start<=end) {
      long mid = start + (end - start) /2;
      if(mid*mid == num) {
        return true;
      } else if( mid*mid > num) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return false;
  }
}