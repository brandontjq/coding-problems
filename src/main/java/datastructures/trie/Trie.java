package datastructures.trie;

public class Trie {
    private static class Node {
        private Node[] children;
        private boolean isWord;

        public Node() {
            children = new Node[26];
            isWord = false;
        }
    }

    private Node root;

    public Trie() {
        root = new Node();
    }

    public void insert(String word) {
        Node node = root;
        for(int i = 0; i < word.length(); i++ ) {
            char c = word.charAt(i);
            if(node.children[c - 'a'] == null) {
                node.children[c - 'a'] = new Node();
            }
            node = node.children[c - 'a'];
        }
        node.isWord = true;
    }

    public boolean search(String word) {
        Node node = getNode(word);
        return node != null && node.isWord;
    }
    public boolean startsWith(String prefix) {
        return getNode(prefix) != null;
    }

    private Node getNode(String word) {
        Node node = root;
        for(int i = 0; i < word.length(); i++ ) {
            char c = word.charAt(i);
            if(node.children[c - 'a'] == null) {
                return null;
            }
            node = node.children[c - 'a'];
        }
        return node;
    }
}
