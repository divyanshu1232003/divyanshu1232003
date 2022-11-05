import java.util.*;
public class factorialfunction {
    public static void factorial(int n){
        if (n<0){
            System.out.print("invalid ");
        }
        int factorial1=1;
         for(int i =n;i>=1;i--){
             factorial1=factorial1*i;
             
         }
         System.out.println(factorial1);

    }
    public static void main(String args[]){
        Scanner sc =new Scanner (System.in);
        int n =sc.nextInt();
         factorial(n);

    }
    
}
