import java.util.Scanner;

public class Tutorial1Q5 {
    
    public static void main(String[] args) {
       
        showOddNumber();
        
    }
    
    static void showOddNumber(){ 
       int minNum, maxNum, sum=0;
        
        
        Scanner scan = new Scanner(System.in);
       
        System.out.print(" Enter min values: ");
        minNum = scan.nextInt();
        
        System.out.print(" Enter max values: ");
        maxNum = scan.nextInt();
        
        for (int i=minNum ; i<=maxNum ;i++ ){
            
            if (i % 2 != 0) {
                System.out.println(i);
                sum+= i;
            } 
          
        }
        System.out.println("Sum of all this odd number is " + sum);
        
      
      }
     
}
