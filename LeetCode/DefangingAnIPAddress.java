/**
 * https://leetcode.com/problems/defanging-an-ip-address/
 */
public class DefangingAnIPAddress {
    public String defangIPaddr(String address) {
        // address.replaceAll("\\.", "[.]");
        return String.join("[.]", address.split("\\."));
    }
}
