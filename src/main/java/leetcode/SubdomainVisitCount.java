package leetcode;

import java.util.*;

public class SubdomainVisitCount {

    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();

        for (String entry : cpdomains) {
            String[] parts = entry.split(" ");
            int count = Integer.parseInt(parts[0]);

            String[] domains = parts[1].split("\\.");

            String combinedDomain = "";
            for (int i = domains.length - 1; i >=0; i--) {
                String domain = domains[i];
                if (i == domains.length - 1) {
                    combinedDomain = domain;
                } else {
                    combinedDomain = domain + "." + combinedDomain;
                }

                map.put(combinedDomain, map.getOrDefault(combinedDomain, 0) + count);
            }
        }
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            String domain = entry.getKey();
            String res = value + " " + domain;
            result.add(res);
        }
        return result;
    }
}
