package ss19_string_regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidatePhone {
    public static final String REGEX_PHONE = "(((\\+|)84)|0)\\d{9}$";
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(REGEX_PHONE);
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(" Enter Phone number : ");
            String phone = scanner.nextLine();
            if (!pattern.matcher(phone).matches()) {
                System.out.println(" !! false again phone number ");
            } else {
                System.out.println("Enter successful");
                break;
            }
        } while (true);
    }

}