public class pascal {
    public static void main(String args[]) {
        int n =5;
        int i,j;
        
         
        for( i=1;i<=n;i++){
         for( j=n-i;j>=1;j--){
             System.out.print(" ");
             }int num=1;
         for( j=1;j<=i;j++){
             if(j==1||j==n){
                 System.out.print("1");

             }
             else{
                
                 System.out.print(num);
                 num=num*(i-j)/(j+1);
             }
             
            }System.out.println();
             
         } 
        }}

        
    
    
