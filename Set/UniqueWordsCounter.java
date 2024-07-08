package Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueWordsCounter {
    private Set<String> uniqueWords;

    public UniqueWordsCounter() {
        this.uniqueWords = new HashSet<>();
    }

    public void readInput(Scanner scanner) {
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            if (line.isEmpty()) {
                break; // Terminate input on empty line
            }
            String[] words = line.split("\\W+");  // Split by non-word characters
            for (String word : words) {
                if (!word.isEmpty()) {
                    uniqueWords.add(word.toLowerCase());  // Convert to lowercase to ensure uniqueness
                }
            }
        }
    }

    public int getUniqueWordCount() {
        return uniqueWords.size();
    }

    public void displayUniqueWords() {
        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        UniqueWordsCounter counter = new UniqueWordsCounter();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the text (terminate input with an empty line):");

        counter.readInput(scanner);

        System.out.println("Number of unique words: " + counter.getUniqueWordCount());
        System.out.println("Unique words:");
        counter.displayUniqueWords();

        scanner.close();
    }
}
