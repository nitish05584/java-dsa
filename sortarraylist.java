import java.util.*;

public class sortarraylist {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(24);
        list.add(4);
        list.add(39);
        list.add(6);
        list.add(10);
        list.add(8);
         System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

    }
}
