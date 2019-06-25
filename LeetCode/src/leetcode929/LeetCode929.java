package leetcode929;

import java.util.HashSet;

/**
 * Created by bumblebee on 2019/1/25.
 */
public class LeetCode929 {

    public static void main(String[] args) {
        String[] emails = new String[]{
                "test.email+alex@leetcode.com",
                "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com",
                "tesp.email+alex@leetcode.com"
        };
        System.out.println(new LeetCode929().numUniqueEmails(emails));
    }

    public int numUniqueEmails(String[] emails) {
        if (emails == null || emails.length == 0) {
            return 0;
        }

        HashSet<String> emailSet = new HashSet<>();

        for (String email : emails) {
            if (email == null || email.length() == 0) {
                continue;
            }
            int indexOfDomain = email.indexOf('@');
            String preString = email.substring(0, indexOfDomain);
            String domainString = email.substring(indexOfDomain);

            if (preString.contains("+")) {
                preString = preString.substring(0, preString.indexOf('+'));
            }
            preString = preString.replace(".", "");
            String result = preString + domainString;
            emailSet.add(result);
        }

        return emailSet.size();
        /*Set<String> seen = new HashSet<>();
        for (String email: emails) {
            int i = email.indexOf('@');
            String rest = email.substring(i);
            seen.add(rest);
        }
        return seen.size();*/
    }
}
