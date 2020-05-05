/**
 *  First Unique Character in a String
 *  Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 *  Examples:
 *
 * s = "leetcode"
 * return 0.
 *
 * s = "loveleetcode",
 * return 2.
 * Note: You may assume the string contain only lowercase letters.
 *
 * */
class Solution {
  public int firstUniqChar(String s) {
    if(s == null || s.length() == 0) {
      return -1;
    }
    int[] hash = new int[256];

    for(char c : s.toCharArray()) {
      hash[c] = hash[c] + 1;
    }
    for(int i = 0; i< s.length(); i++) {
      if(hash[s.charAt(i)] == 1) {
        return i;
      }
    }
    return -1;
  }
}