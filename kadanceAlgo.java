public class kadanceAlgo {
    public static void kadanes(int numbers[]){
       int ms=Integer.MIN_VALUE;
       int cs=0;
       for(int i=0;i<numbers.length;i++){
        cs=Math.max(numbers[i],cs+numbers[i]);
        ms=Math.max(cs,ms);
    } 
    System.out.println(ms);
    }
   public static void main(String[] args) {
    int numbers[]={-2,-3,4,-1,-2,1,5,-3};
    kadanes(numbers);
   } 
}
