package Version_2;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayLinkedList();
    }
    public static void ArrayLinkedList(){
        ArrayList<Double> arr = new ArrayList<>();
        LinkedList<Double> link = new LinkedList<>();
        int a = 500000;
        int b = 500;
        long startTime = System.nanoTime();
        for (int i = 0; i < a; i++) {
            arr.add(Math.random());
        }
        System.out.println(System.nanoTime() - startTime + "\tНС\tArrayList");
        startTime = System.nanoTime();
        for(int i = 0; i < a; i++){
            link.add(Math.random());
        }
        System.out.println(System.nanoTime() - startTime + "\tНС\tLinkedList");
        startTime = System.nanoTime();
        for (int i = 0; i < b; i++) {
            arr.get((int) (Math.random() * (a - 1)));
        }
        System.out.println(System.nanoTime() - startTime + "\t\tНС\tArrayList");
        startTime = System.nanoTime();
        for (int i = 0; i < b; i++) {
            link.get((int) (Math.random() * (a - 1)));
        }
        System.out.println(System.nanoTime() - startTime + "\tНС\tLinkedList");
    }
}
