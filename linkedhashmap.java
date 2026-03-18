import java.util.*;
public class linkedhashmap {
    
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
        lhm.put("India",100);
        lhm.put("China",150);
        lhm.put("Us",50);

         HashMap<String,Integer> hm=new HashMap<>();
        hm.put("India",100);
        hm.put("China",150);
        hm.put("Us",50);

        System.out.println(lhm);
        System.out.println(hm);
    }
}
