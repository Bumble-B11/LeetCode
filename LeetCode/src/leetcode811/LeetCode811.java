package leetcode811;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode811 {

    public static void main(String[] args) {
        String[] arg = {
                "900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"
        };
        System.out.println(new LeetCode811().subdomainVisits(arg).toString());
    }

    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String, Integer> pairs = new HashMap<>();
        for (String cp : cpdomains) {
            String[] array = cp.split(" ");
            int count = Integer.valueOf(array[0]);
            String domain = array[1];

            for (String subDomain : getSubDomains(domain)) {
                int subCount = pairs.get(subDomain) == null ? 0 : pairs.get(subDomain);
                subCount += count;
                pairs.put(subDomain, subCount);
            }
        }

        List<String> result = new ArrayList<>();
        for (String subDomain : pairs.keySet()) {
            String pair = pairs.get(subDomain) + " " + subDomain;
            result.add(pair);
        }
        return result;
    }

    public List<String> getSubDomains(String domain) {
        List<String> domains = new ArrayList<>();
        domains.add(domain);
        for (int i = 0; i < domain.length(); i ++) {
            if (domain.charAt(i) == '.') {
                domains.add(domain.substring(i +1));
            }
        }
        return domains;
    }
}
