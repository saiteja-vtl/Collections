package Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class OrderedElements {


    private Set<String> elements;


    public OrderedElements() {
        this.elements = new LinkedHashSet<>();
    }


    public void addElement(String element) {
        elements.add(element);
    }


    public void displayElements() {
        for (String element : elements) {
            System.out.println(element);
        }
    }


    public static void main(String[] args) {
        OrderedElements orderedElements = new OrderedElements();


        orderedElements.addElement("Apple");
        orderedElements.addElement("Banana");
        orderedElements.addElement("Cherry");
        orderedElements.addElement("Apple");
        orderedElements.addElement("Date");


        System.out.println("Elements in insertion order:");
        orderedElements.displayElements();
    }
}
