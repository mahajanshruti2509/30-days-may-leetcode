/**
 * Ransom Note
 * Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.
 *
 * Each letter in the magazine string can only be used once in your ransom note.
 *
 * Note:
 * You may assume that both strings contain only lowercase letters.
 *
 * canConstruct("a", "b") -> false
 * canConstruct("aa", "ab") -> false
 * canConstruct("aa", "aab") -> true
 *
 */
class Solution {
  public boolean canConstruct(String ransomNote, String magazine) {
    if(ransomNote.length() > magazine.length()) {
      return false;
    }

    HashMap<Character, Integer> letterCount = new HashMap<>();

    for(char m : magazine.toCharArray()) {
      letterCount.put(m, letterCount.getOrDefault(m, 0) + 1);
    }

    for (char r : ransomNote.toCharArray()) {
      if(!letterCount.containsKey(r) || letterCount.get(r) <= 0) {
        return false;
      }
      letterCount.put(r, letterCount.get(r) - 1);
    }
    return true;
  }
}