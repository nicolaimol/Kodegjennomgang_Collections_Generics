import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class Ekstraoppgave {
    public static void main(String[] args) {
        ArrayList<Integer> tallArrayList = new ArrayList<>();
        Vector<Integer> tallVector = new Vector<>();
        LinkedList<Integer> tallLinkedList = new LinkedList<>();
        Stack<Integer> tallStack = new Stack<>();

        long startA = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            tallArrayList.add(i);
        }
        long endA = System.currentTimeMillis();

        long startV = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            tallVector.add(i);
        }
        long endV = System.currentTimeMillis();

        long startL = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            tallLinkedList.add(i);
        }
        long endL = System.currentTimeMillis();

        long startS = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            tallStack.add(i);
        }
        long endS = System.currentTimeMillis();

        System.out.println("Arraylist: " + (endA - startA));
        System.out.println("Vector: " + (endV - startV));
        System.out.println("LinkedList: " + (endL - startL));
        System.out.println("Stack: " + (endS - startS));


        long startTimeA = System.currentTimeMillis();
        for (int i : tallArrayList) {

        }
        long endTimeA = System.currentTimeMillis();

        long startTimeV = System.currentTimeMillis();
        for (int i : tallVector) {

        }
        long endTimeV = System.currentTimeMillis();

        long startTimeL = System.currentTimeMillis();
        for (int i : tallLinkedList) {

        }
        long endTimeL = System.currentTimeMillis();

        System.out.println("Arraylist: " + (endTimeA - startTimeA));
        System.out.println("Vector: " + (endTimeV - startTimeV));
        System.out.println("LinkedList: " + (endTimeL - startTimeL));
    }
}
