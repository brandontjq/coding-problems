package leetcode;

import java.util.*;

public class WordDictionary {

    private static class Node{
        private Node[] children;
        private boolean isWord;
        private char c;

        public Node(char c) {
            this.c = c;
            this.children = new Node[26];
        }
    }

    private Node root;

    /** Initialize your data structure here. */
    public WordDictionary() {
        this.root = new Node(' ');
    }

    public void addWord(String word) {
        Node node = root;
        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if(node.children[c - 'a'] == null){
                node.children[c - 'a'] = new Node(c);
            }
            node = node.children[c - 'a'];
        }
        node.isWord = true;
    }

    public boolean search(String word) {
        return getNodes(word, root, 0);
    }

    private boolean getNodes(String word, Node node, int index) {
        if(index == word.length()) {
            if(node.isWord){
                return true;
            } else {
                return false;
            }
        }


        char c = word.charAt(index);
        if(c == '.') {
            for(int j = 0; j < node.children.length; j++) {
                if(node.children[j] != null) {
                    node = node.children[j];
                    boolean result = getNodes(word, node, ++index);
                    if (result) {
                        return true;
                    }
                }
            }
            return false;
        } else if (node.children[c - 'a'] == null) {
            return false;
        } else {
            node = node.children[c - 'a'];
        }


        return getNodes(word, node, ++index);
    }
}
