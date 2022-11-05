import java.util.*;
public class table_usingfunction {
    public static void table1(int n ){
        for(int i =1; i<=10;i++){
            int  multiply =n*i;
            System.out.println(n+"*"+i+"="+ multiply);
        }
    }
    public static void main(String args[]){
        Scanner sc =new Scanner (System.in);
        int n =sc.nextInt();
              table1(n);
    }
    
}
