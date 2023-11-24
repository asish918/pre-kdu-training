import java.util.*;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 Strings - ");
        String s1 = sc.next();
        String s2 = sc.next();

        System.out.println("\nChecks - \n");

        System.out.println("~ Length of 1st String - " + s1.length());
        System.out.println("~ Length of 2nd String - " + s2.length());

        if (s1.length() == s2.length())
            System.out.println("~ The length of the 2 strings is same!");
        else
            System.out.println("~ The length of the 2 strings is different");
        if (s1.equals(s2))
            System.out.println("~ The strings are equal");
        else
            System.out.println("~ The strings are not equal");

        sc.close();
    }
}