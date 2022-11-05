import java.util.*;
public class greatest_function {
    
        public static void greater1(int a,int b){
            if(a>b){
                System.out.println(a+" is greater");
            }else{
                System.out.println(b+" is greater");
            }

        }
        public static void main(String args[]){
        Scanner sc =new Scanner (System.in);
        int a = sc.nextInt();
        int b=sc.nextInt();
                 greater1(a, b);
    }
    
}
