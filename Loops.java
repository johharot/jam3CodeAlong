import java.util.ArrayList;

import javax.print.attribute.IntegerSyntax;

public class Loops {

    public static void main(String[] args) {
        // creating an object to call out the non-static

        // class, a new name = a new class
        Loops loops = new Loops();
        // loops.originalForLoop();
        // loops.nestedLooping();
        // loops.whileLoops();
        loops.forEach();

    }

    public void originalForLoop() {

        // for (int i = 10; i > -1; i--) {
        // System.out.println(i);
        // }

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Integer integer = new Integer(1);
        arrayList.add(integer);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

    public void nestedLooping() {
        ArrayList<ArrayList<Integer>> listContainer = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);
        list2.add(10);

        // adding both list inside our main method
        listContainer.add(list1);
        listContainer.add(list2);

        // for each list container, we want to loop through it's value

        for (int i = 0; i < listContainer.size(); i++) {// only to call out i
            // ArrayList<Integer> currentList = listContainer.get(i);
            // currentList.size();
            for (int j = 0; j < listContainer.get(i).size(); j++) {// nested j inside i loop or list 1 into list 2
                System.out.println(listContainer.get(i).get(j));// we are going through each list by calling out J
            }
        }
    }

    public void whileLoops() {

        // while(condition){
        // do something
        // }
        // int i = 0;
        // while(i < 10){
        // System.out.println(i);
        // i++;
        // }

        boolean isFoodDelicious = true;
        boolean newChef = false;
        int timesVisited = 0;

        do {
            timesVisited++;
            System.out.println("Eating the food");
            if (newChef || timesVisited > 9) {
                isFoodDelicious = false;
            }

        } while (isFoodDelicious);
    }

    public void forEach() {
        ArrayList<Integer> ints = new ArrayList<Integer>();

        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);
        ints.add(5);
        for (Integer i : ints) {
            print(i);//referring to the new made class to call out so we don't have to create a printLn method for each object
        }
    }

    public void print(Integer i) {
        System.out.println(i);
    }

}
