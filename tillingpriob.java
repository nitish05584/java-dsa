public class tillingpriob {
    public static int tilingProblem(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fnm1=tilingProblem(n-1)+tilingProblem(n-2);
        return fnm1;
    }
    public static void main(String[] args) {
        System.out.println(tilingProblem(3));
    }
}
