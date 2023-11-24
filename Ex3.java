import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Ex3 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("data.csv"));

        Map<String, Integer> wordCounts = new HashMap<>();

        String line;
        while ((line = reader.readLine()) != null) {

            String[] words = line.split(",");

            for (String word : words) {
                if (!wordCounts.containsKey(word)) {
                    wordCounts.put(word, 0);
                }
                wordCounts.put(word, wordCounts.get(word) + 1);
            }
        }

        Stream<Map.Entry<String, Integer>> sorted_word_counts = wordCounts.entrySet().stream()
                .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                .limit(3);

        System.out.println("Top 3 repeated words - ");
        sorted_word_counts.forEach(entry -> System.out.println("~" + entry.getKey() + ": " + entry.getValue()));

        reader.close();
    }
}
