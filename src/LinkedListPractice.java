import java.util.LinkedList;

public class LinkedListPractice {
    public static void main(String[] args) {
        LinkedList list=new LinkedList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        System.out.println(list);

        list.add(2,2);
        System.out.println(list);
    }
}
