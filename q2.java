import java.util.HashMap;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Long> stringMap = new HashMap<>();

        stringMap.put("Steve", 31L);
        stringMap.put("Tony", 100009L);
        stringMap.put("Thor", 97L);

        System.out.print("Enter a string x - ");
        String x = sc.nextLine();

        System.out.print("Enter a character y - ");
        char y = sc.next().charAt(0);

        if (stringMap.containsKey(x)) {
            String formattedString = formatString(x, y);
            System.out.println(formattedString + ": " + stringMap.get(x));
        } else {
            System.out.println("\"" + x + "\" is not a key");
        }

        sc.close();
    }

    public static String formatString(String input, char substituteChar) {
        input = input.toLowerCase();

        StringBuilder formattedString = new StringBuilder(input);

        for (int i = 0; i < formattedString.length(); i++) {
            char currentChar = formattedString.charAt(i);
            if (isVowel(currentChar)) {
                formattedString.setCharAt(i, substituteChar);
            }
        }

        return formattedString.toString();
    }

    public static boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'u' || ch == 'o')
            return true;
        else
            return false;
    }
}