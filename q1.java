import java.util.ArrayList;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size - ");
        int N = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<Integer>(N);
        int max_val = Integer.MIN_VALUE, min_val = Integer.MAX_VALUE;

        System.out.println("Enter array values - ");
        for (int i = 0; i < N; i++) {
            int arr_val = sc.nextInt();
            arr.add(arr_val);
        }

        for (int i : arr) {
            max_val = Math.max(max_val, i);
            min_val = Math.min(min_val, i);
        }

        System.out.println("Maximum value of the array is - " + max_val + "\n");
        System.out.println("Minimum value of the array is - " + min_val);

        sc.close();
    }
}
