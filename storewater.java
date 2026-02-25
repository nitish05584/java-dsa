import java.util.*;
public class storewater {
    public static int storeWater(ArrayList<Integer>height){
        int maxWater=0;
        int lp=0;
        int rp=height.size()-1;
        while(lp<rp){
            int ht=Math.min(height.get(lp),height.get(rp));
            int with=rp-lp;
            int currWater=ht*with;
            maxWater=Math.max(currWater,maxWater);

            if(height.get(lp)<height.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer>height=new ArrayList<>();
        height.add(1);
         height.add(4);
        height.add(9);
        height.add(10);
       height.add(11);
       height.add(8);
       height.add(2);
       System.out.println(storeWater(height));

    }
}
