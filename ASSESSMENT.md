# PRE-KDU Assessment

### Q1

```java
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
```

### <u>Output</u>

```bash
❯ javac q1.java && java q1
Enter array size -
5
Enter array values -
20
60
40
70
10
Maximum value of the array is - 70

Minimum value of the array is - 10
```

<hr />

### Q2

```java
import java.util.HashMap;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Long> stringMap = new HashMap<>();

        stringMap.put("raj", 31L);
        stringMap.put("rohan", 100009L);
        stringMap.put("ravi", 97L);

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
```

### <u>Output</u>

```bash
❯ javac q2.java && java q2
Enter a string x - Steve
Enter a character y - a
stava: 31
❯ javac q2.java && java q2
Enter a string x - Hulk
Enter a character y - a
"Hulk" is not a key
```

<hr />

### Q3

```javascript
function outerFunction() {
  let outerVariable = "KDU";

  function innerFunction(enchantingObject) {
    for (let property in enchantingObject) {
      if (typeof enchantingObject[property] === "string") {
        outerVariable += " " + enchantingObject[property];
      }
    }

    return outerVariable;
  }

  return innerFunction;
}

const obj1 = {
  a: 15,
  b: 20,
  c: "24",
};

const obj2 = {
  a: 5,
  b: 10,
  c: "WORLD",
  d: true,
};

const closureFunction = outerFunction();

const magicalOutput1 = closureFunction(obj1);
const magicalOutput2 = closureFunction(obj2);

console.log(magicalOutput1);
console.log(magicalOutput2);
```

### <u>Output</u>

```bash
❯ node q3.js
KDU 24
KDU 24 WORLD
```

<hr />
