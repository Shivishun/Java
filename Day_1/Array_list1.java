import java.util.*;
public class Array_list1 {
    public static void main(String args[]) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Apple");
        arrayList.add("Mango");
        arrayList.add("Orange");
        arrayList.add("Banana");
        System.out.println("List before removal:");
        for (String element : arrayList) {
            System.out.println(element);
        }
        Iterator<String> itr = arrayList.iterator();
        while (itr.hasNext()) {
            String currentElement = itr.next();
            if (currentElement.equals("Banana")) {
                itr.remove();
            }
        }
        System.out.println("\nList after removal:");
        for (String element : arrayList) {
            System.out.println(element);
        }
    }
}