package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubdomainVisitCountTest {

    @Test
    void test() {
        SubdomainVisitCount test = new SubdomainVisitCount();
        String[] cpDomains = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        var result = test.subdomainVisits(cpDomains);
        System.out.println(result);
    }
}