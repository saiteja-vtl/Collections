package Set;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetComparison {


    private Set<Integer> hashSet;
    private Set<Integer> treeSet;


    public SetComparison() {
        this.hashSet = new HashSet<>(); // Initialize HashSet
        this.treeSet = new TreeSet<>(); // Initialize TreeSet
    }


    public void addElements(Set<Integer> set, int numberOfElements) {
        long startTime = System.nanoTime();
        for (int i = 0; i < numberOfElements; i++) {
            set.add(i);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Time taken to add " + numberOfElements + " elements: " + duration + " nanoseconds");
    }


    public void displaySet(Set<Integer> set) {
        for (Integer element : set) {
            System.out.print(element + " ");
        }
        System.out.println();
    }


    public void comparePerformance(int numberOfElements) {
        System.out.println("Adding elements to HashSet:");
        addElements(hashSet, numberOfElements);

        System.out.println("Adding elements to TreeSet:");
        addElements(treeSet, numberOfElements);
    }


    public static void main(String[] args) {
        SetComparison comparison = new SetComparison();
        int numberOfElements = 50;


        comparison.comparePerformance(numberOfElements);


        System.out.println("HashSet elements (unordered):");
        comparison.displaySet(comparison.hashSet);

        System.out.println("TreeSet elements (sorted):");
        comparison.displaySet(comparison.treeSet);
    }
}

