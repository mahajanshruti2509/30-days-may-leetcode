/**
* Number Complement
*
* Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.
* Example 1:
* Input: 5
* Output: 2
* Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2
**/

class Solution {
  public int findComplement(int num) {
    int result = 0;
    int power = 1;
    while(num > 0) {
      result += (num % 2 ^ 1) * power;
      power <<= 1; // multiplying by 2
      num >>= 1; // dividing by 2
    }
    return result;
  }
}