import java.util.*; 
public class average_function {
    public static void average1(int a,int b ,int c){
        int avg =(a+b+c)/3;
        System.out.println( "average is ="+ avg);

    }
    public static void main(String args[]){
        Scanner sc =new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
             average1(a, b, c);
    }
    
}
