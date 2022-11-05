import java.util.*;
public class fibonacci_funtions {
    public static void fibonacci1(int n){
        int a=0; int b=1;
        for(int i=1;i<=n;i++){
            int c=a+b;  
            System.out.println(c);
           
              a=b;
              b=c;
            
         
        }
    }
    
    
        
    
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
          fibonacci1(n);
    }
    
}
