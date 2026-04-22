package leetcode;

import java.util.*;

public class SearchSuggestionSystem {

    private static class Trie {
        private static class Node{
            private Node[] children;
            private boolean isWord;

            public Node(){
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
            for(int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if(node.children[c - 'a'] == null) {
                    node.children[c - 'a'] = new Node();
                }
                node = node.children[c - 'a'];
            }
            node.isWord = true;
        }

        public boolean startsWith(String prefix) {
            return getNode(prefix) != null;
        }

        private Node getNode(String word) {
            Node node = root;
            for(int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if(node.children[c - 'a'] == null) return null;
                node = node.children[c - 'a'];
            }
            return node;
        }
    }


    public List<List<String>> suggestedProducts(String[] products, String searchWord){
        Arrays.sort(products);
        Map<String, Trie> map = new HashMap<>();
        for(String product : products) {
            Trie trie = new Trie();
            trie.insert(product);
            map.put(product, trie);
        }
        List<List<String>> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < searchWord.length(); i++) {
            List<String> list = new ArrayList<>();
            char c = searchWord.charAt(i);
            sb.append(c);
            int count = 0;
            for(String product : products) {
                Trie trie = map.get(product);
                if(trie.startsWith(sb.toString())) {
                    list.add(product);
                    count++;
                }

                if(count ==3) break;
            }
            result.add(list);
        }
        return result;
    }

    public List<List<String>> suggestedProducts2(String[] products, String searchWord) {
        List<List<String>> finalResult = new ArrayList();
        if (products == null || products.length == 0 || searchWord == null || searchWord.isEmpty()) {
            return finalResult;
        }
        Arrays.sort(products);
        // create productList for the products
        List<String> possibleProductList = new ArrayList();
        for(String product: products) {
            possibleProductList.add(product);
        }
        for(int i=0; i<searchWord.length(); i++) {
            char c = searchWord.charAt(i);
            // check in possible product list and filter products
            List<String> filteredList = new ArrayList();
            for(String product: possibleProductList) {
                if(i < product.length() && c == product.charAt(i)) {
                    filteredList.add(product);
                }
            }
            // add only atmost three items to the intermediate result
            List<String> intermediateResult = new ArrayList();
            for(int j=0; j < 3 && j<filteredList.size(); j++) {
                intermediateResult.add(filteredList.get(j));
            }

            // add intermediateResult to the final result
            finalResult.add(intermediateResult);

            // change the possibleProductList to the already filtered list
            possibleProductList = filteredList;
        }
        return finalResult;
    }
}
