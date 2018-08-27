
/*Write regular expression for phone in formats:
+38 ххх ххх хх хх
+38-ххх-ххх-хх-хх
+38хххххххххх
 */

package com.demo;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Phone {

    public static void main(String[] args) {

        System.out.println("Enter phone number to validate. Possible formats are: +38 ххх ххх хх хх, +38-ххх-ххх-хх-хх and +38хххххххххх:\n");

        Scanner scanner = new Scanner(System.in);

        String phoneNumber = scanner.nextLine();

        Pattern pattern = Pattern.compile("[\\+38\\s?-?((0[1-9][0-9])\\s?-?)(\\d{3}\\s?-?)(\\d{2}\\s?-?){2}]");

        Matcher matcher = pattern.matcher(phoneNumber);

        if (matcher.matches()) {
            System.out.println("\nPhone number '" + phoneNumber + "' is correct");
        } else {
            System.out.println("\nPhone nubmer '" + phoneNumber + "' is incorrect");
        }

    }
}
