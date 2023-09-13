/*
 * Validate IP Address: Implement a program to validate if a given string is a valid IP address or
not.
. Validate IP Address: Test Case 1: Input: "192.168.0.1" Expected Output: True
Test Case 2: Input: "256.256.256.256" Expected Output: False
Test Case 3: Input: "192.168.0.256" Expected Output: False
Test Case 4: Input: "12.34.56.789" Expected Output: False
 */

package assignment_6;
import java.util.Scanner;
public class validate_ip_address {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter an IP address: ");
	        String ipAddress = scanner.nextLine();
	        scanner.close();

	        boolean isValidIP = validateIPAddress(ipAddress);

	        if (isValidIP) {
	            System.out.println("True: " + ipAddress);
	        } else {
	            System.out.println("False: " + ipAddress);
	        }
	    }

	    public static boolean validateIPAddress(String ipAddress) {
	      
	        String[] oc = ipAddress.split("\\.");

	        if (oc.length != 4) {
	            return false; 
	        }

	        for (String octet : oc) {
	            try {
	                int value = Integer.parseInt(octet);

	                if (value < 0 || value > 255) {
	                    return false; 
	                }

	                
	                if (octet.length() > 1 && octet.charAt(0) == '0') {
	                    return false;
	                }
	            } catch (NumberFormatException e) {
	                return false; 
	            }
	        }

	        return true;

	}

}
