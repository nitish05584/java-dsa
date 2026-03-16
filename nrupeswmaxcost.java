import java.util.*;
public class nrupeswmaxcost {
    
    
    public static void main(String[] args) {
        int rupes[]={2,3,3,4,6};
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i=0; i<rupes.length; i++){
            pq.add(rupes[i]);
        }
        int cost=0;
        while(pq.size()>1){
            int min=pq.remove();
            int min2=pq.remove();
            cost +=min+min2;
            pq.add(min+min2);
        }
        System.out.println(cost);
    }
}
