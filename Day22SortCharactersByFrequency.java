/**
 * Sort Characters By Frequency
 *
 * Given a string, sort it in decreasing order based on the frequency of characters.
 *
 * Example 1:
 *
 * Input:
 * "tree"
 *
 * Output:
 * "eert"
 *
 * Explanation:
 * 'e' appears twice while 'r' and 't' both appear once.
 * So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
 * Example 2:
 *
 * Input:
 * "cccaaa"
 *
 * Output:
 * "cccaaa"
 *
 * Explanation:
 * Both 'c' and 'a' appear three times, so "aaaccc" is also a valid answer.
 * Note that "cacaca" is incorrect, as the same characters must be together.
 * Example 3:
 *
 * Input:
 * "Aabb"
 *
 * Output:
 * "bbAa"
 *
 * Explanation:
 * "bbaA" is also a valid answer, but "Aabb" is incorrect.
 * Note that 'A' and 'a' are treated as two different characters.
 *
 */
  public String frequencySort(String s) {
    Map<Character, Integer> charCountMap = new HashMap<>();
    StringBuilder sb = new StringBuilder();

    for(int i = 0; i < s.length(); i++) {
      char ch  = s.charAt(i);
      charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
    }

    PriorityQueue<Character> pq = new PriorityQueue<Character>( (a, b) -> charCountMap.get(b) - charCountMap.get(a) );

    pq.addAll(charCountMap.keySet());

    while(!pq.isEmpty()) {
      char ch = pq.remove();
      for(int i =0; i < charCountMap.get(ch); i++) {
        sb.append(ch);
      }
    }
    return sb.toString();
  }
}