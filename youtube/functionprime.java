import java.util.*;
public class functionprime {
    public static void primenumbers(int n){
       int count =0;
      for(int i=2;i<n-1;i++){
         
         
          if(n%i==0){
              count =count+1;
           
          }
        }
          if (count>0){
              System.out.println("not prime ");
          }
          else{
              System.out.println("prime");
          }
        }
       
      
    
    public static void main(String args[]){
        Scanner sc =new Scanner (System.in);
        int n =sc.nextInt();
            primenumbers(n);
    }
}
