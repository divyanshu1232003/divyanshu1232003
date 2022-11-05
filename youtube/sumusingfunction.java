import java.util.Scanner;
public class sumusingfunction{

        public static int calculatesum(int a,int b){
                      
            return a+b;
        
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();

        int sum =calculatesum(a,b);
        System.out.println("the sum of two numbers is :"+sum);

    }
    
}
