/**
 * Implement a trie with insert, search, and startsWith methods.
 *
 * Example:
 *
 * Trie trie = new Trie();
 *
 * trie.insert("apple");
 * trie.search("apple");   // returns true
 * trie.search("app");     // returns false
 * trie.startsWith("app"); // returns true
 * trie.insert("app");
 * trie.search("app");     // returns true
 * Note:
 *
 * You may assume that all inputs are consist of lowercase letters a-z.
 * All inputs are guaranteed to be non-empty strings.
 *
 * */
class TrieNode {
  public boolean isLeaf;
  HashMap<Character, TrieNode> children;
  // Initialize your data structure here.
  public TrieNode() {
    isLeaf = false;
    children = new HashMap<Character, TrieNode>();
  }
}

public class Trie {
  private TrieNode root;

  public Trie() {
    root = new TrieNode();
  }

  // Inserts a word into the trie.
  public void insert(String word) {
    HashMap<Character, TrieNode> children = root.children;
    for (int i = 0; i < word.length(); i ++) {
      char c = word.charAt(i);
      if (!children.containsKey(c)) {
        TrieNode node = new TrieNode();
        children.put(c, node);
      }
      TrieNode node = children.get(c);
      if (i == word.length() - 1) {
        node.isLeaf = true;
      }
      children = node.children;
    }
  }
  private TrieNode searchNode(String pre) {
    HashMap<Character, TrieNode> children = root.children;
    TrieNode node = root;
    for (int i = 0; i < pre.length(); i ++) {
      if (!children.containsKey(pre.charAt(i))) {
        return null;
      }
      node = children.get(pre.charAt(i));
      children = node.children;
    }
    return node;
  }
  // Returns if the word is in the trie.
  public boolean search(String word) {
    TrieNode node = searchNode(word);
    return node != null && node.isLeaf == true;
  }

  // Returns if there is any word in the trie
  // that starts with the given prefix.
  public boolean startsWith(String prefix) {
    TrieNode node = searchNode(prefix);
    return node != null;
  }
}