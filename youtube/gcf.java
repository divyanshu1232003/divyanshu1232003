import java.util.*;
public class gcf {
    public static void gcf1(int a,int b){
        int c=0;
        for(int i=1;i<=a;i++){
            if(a%i==0&&b%i==0){
               c=i;
            }
            
        }System.out.println(c);
    }
    public static void main(String args[]){
        
        Scanner sc =new Scanner(System.in );
        int a =sc.nextInt();
        int b =sc.nextInt();
            gcf1(a, b);
    }
    
}
