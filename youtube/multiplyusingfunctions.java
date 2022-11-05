import java.util.Scanner;

public class multiplyusingfunctions {
   
        public static int functions(int a,int b){
            return a*b;
        }
        public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int multiply= functions(a,b);
            System.out.println("the multiplication of two nymbers is :"+multiply);
        

    
    }
    
}
