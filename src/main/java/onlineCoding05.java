import java.util.LinkedList;

public class onlineCoding05 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(5);
        linkedList.add(4);
        linkedList.add(3);
        linkedList.add(8);
        linkedList.add(8);

        LinkedList<Integer> linkedList2 = conversion(linkedList, 3);
        System.out.println(linkedList2.toString());

    }

    public static LinkedList<Integer> conversion(LinkedList<Integer> list, int position) {
        list.remove(list.size()-position);
        return list;
    }

}
