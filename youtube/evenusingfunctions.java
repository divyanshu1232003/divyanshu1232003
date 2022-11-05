import java.util.*;
public class evenusingfunctions {
    public static void prime1(int n){
        if (n%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    } 
    public static void main (String args []){
        Scanner sc =new Scanner(System.in);
             int  n =sc.nextInt();
             prime1(n);
        
    }
    
}
