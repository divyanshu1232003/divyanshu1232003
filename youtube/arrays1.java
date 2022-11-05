import java.util.Scanner;

public class arrays1 {
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        int size =sc.nextInt();
        int numbers[]=new int[size];
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();

        }
        for(int i=0;i<numbers.length ;i++){
            System.out.println(numbers[i]);
        }
        // int marks[]=new int [3];
        // marks[0]=90;
        // marks[1]=98;
        // marks[2]=95;
        // for(int i =0;i<=2;i++){
        //     System.out.println(marks[i]);
        // }
    }
    
}
