import java.util.*;

public class count_upper_lower_digit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        int upper = 0;
        int lower = 0;
        int digit = 0;
        int space = 0;
        int vowel = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                upper++;
            }

            if (Character.isLowerCase(ch)) {
                lower++;
            }

            if (Character.isDigit(ch)) {
                digit++;
            }

            if (ch == ' ') {
                space++;
            }

            char lowerCh = Character.toLowerCase(ch);

            if (lowerCh == 'a' || lowerCh == 'e' || 
                lowerCh == 'i' || lowerCh == 'o' || 
                lowerCh == 'u') {
                vowel++;
            }
        }

        System.out.println("Uppercase letters: " + upper);
        System.out.println("Lowercase letters: " + lower);
        System.out.println("Digits: " + digit);
        System.out.println("Spaces: " + space);
        System.out.println("Vowels: " + vowel);

        sc.close();
    }
}