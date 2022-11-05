import java.util.*;
public class circumference_function {
    public static void circumference(int r){
        double p=2*3.14*r;
        System.out.println(p);
    }
    public static void main (String args[]){
        Scanner sc =new Scanner(System.in);
        int r =sc.nextInt();
              circumference(r);
    }

    
}
