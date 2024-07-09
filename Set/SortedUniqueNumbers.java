package Set;

import java.util.Set;
import java.util.TreeSet;

public class SortedUniqueNumbers {


    private Set<Integer> numbers;


    public SortedUniqueNumbers() {
        this.numbers = new TreeSet<>();
    }


    public void addNumber(int number) {
        numbers.add(number);
    }


    public void displayNumbers() {
        for (int number : numbers) {
            System.out.println(number);
        }
    }


    public static void main(String[] args) {
        SortedUniqueNumbers uniqueNumbers = new SortedUniqueNumbers();


        uniqueNumbers.addNumber(5);
        uniqueNumbers.addNumber(3);
        uniqueNumbers.addNumber(8);
        uniqueNumbers.addNumber(1);
        uniqueNumbers.addNumber(3);
        uniqueNumbers.addNumber(8);

        // Displaying numbers
        System.out.println("Unique numbers in sorted order:");
        uniqueNumbers.displayNumbers();
    }
}

