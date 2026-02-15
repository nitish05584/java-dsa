public class recnaturalsum {
    public static int calsum(int n){
        if(n==1){
            return 1;
        }
        int sn=n+calsum(n-1);
        return sn;
    }
   public static void main(String[] args) {
    int n=5;
    System.out.println(calsum(n));
   } 
}
