import java.util.*;
public class hashmapA {
    
    public static void main(String[] args) {
        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("India",100);
         hm.put("China",150);
          hm.put("Us",50);

          System.out.println(hm);

          int population=hm.get("India");
          System.out.println(population);

          System.out.println(hm.remove("China"));

          System.out.println(hm);
    }
}
