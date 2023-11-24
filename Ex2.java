import java.util.*;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        HashSet<String> hash_set = new HashSet<>();
        HashMap<String, Integer> hash_map = new HashMap<>();

        System.out.println("Enter 10 Strings - ");

        for (int i = 0; i < 10; i++) {
            String tmp = sc.next();
            arr.add(tmp);
            hash_set.add(tmp);
            hash_map.put(tmp, hash_map.getOrDefault(tmp, 0) + 1);

        }

        System.out.println("\nResults - \n");

        System.out.println("~ List Contains:");
        for (String s : arr)
            System.out.println(s);

        System.out.println("\n~ Set Contains:");
        for (String s : hash_set)
            System.out.println(s);

        System.out.println("\n~ Frequency of Words:");
        for (String s : hash_map.keySet()) {
            System.out.println("Word - " + s + " and its Frequency - " + hash_map.get(s));
        }

        sc.close();

    }
}