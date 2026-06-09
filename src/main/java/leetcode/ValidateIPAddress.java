package leetcode;

public class ValidateIPAddress {
    public String validIPAddress(String queryIP) {
        String neither = "Neither";
        String ipv4 = "IPv4";
        String ipv6 = "IPv6";

        if (queryIP.contains(".")) {
            return checkIpv4(queryIP) ? ipv4 : neither;
        } else if (queryIP.contains(":")) {
            return checkIpv6(queryIP) ? ipv6 : neither;
        } else {
            return neither;
        }

    }

    private boolean checkIpv4(String queryIP) {
        String[] parts = queryIP.split("\\.", -1);

        if (parts.length != 4) return false;

       for (String part : parts) {
           if (part.length() == 0) return false;
           if (part.charAt(0) == '0') return false;

           for (char c : part.toCharArray()) {
               if (!Character.isDigit(c)) return false;
           }

           try {
               int integer = Integer.parseInt(part);
               if (integer < 0 || integer > 255) return false;
           } catch (Exception e) {
               return false;
           }
       }
        return true;
    }
    private boolean checkIpv6(String queryIP) {
        String[] parts = queryIP.split("\\:", -1);

        if (parts.length != 8) return false;

        for (String part : parts) {
            if (part.length() == 0) return false;
            if (part.length() > 4) return false;

            for (char c : part.toCharArray()) {
                boolean isDigit = c >= '0' && c <= '9';
                boolean isLowerHex = c >= 'a' && c <= 'f';
                boolean isUpperHex = c >= 'A' && c <= 'F';

                if (!isDigit && !isLowerHex && !isUpperHex) {
                    return false;
                }
            }
        }
        return true;
    }

}
