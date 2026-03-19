import java.util.*;
public class linkedhaset {
    
    public static void main(String[] args) {
          HashSet<String>cities=new HashSet<>();
       cities.add("delhi");
       cities.add("Mumbai");
       cities.add("Noida");
       cities.add("Bengaluru");
       System.out.println(cities);

       LinkedHashSet<String>lhs=new LinkedHashSet<>();
       lhs.add("delhi");
       lhs.add("Mumbai");
       lhs.add("Noida");
       lhs.add("Bengaluru");

       System.out.println(lhs);

    }
}
