public class trivalEwns {
    public static int getPath(String path){
        int x=0,y=0;
        for(int i=0; i<path.length(); i++){
        char dir=path.charAt(i);
        if(dir=='S'){
            y--;
        }else if(dir=='N'){
            y++;
        }else if(dir=='W'){
            x--;
        }else{
            x++;
        }
        }
        int X2=x*x;
        int Y2=y*y;
        return (int)Math.sqrt(X2+Y2);
    }
    public static void main(String[] args) {
        String path="WEENESENNN";
        System.out.println(getPath(path));
    }
}
