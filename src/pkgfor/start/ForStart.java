
package pkgfor.start;
import java.util.Scanner;

public class ForStart {

   
    public static void main(String[] args) {
             
    Scanner input = new Scanner(System.in);
        System.out.println("enter value");
       int row =input.nextInt();
        System.out.println();
      
       
       
       
       for(int i=1; i<= row; i++ ){
         
       for(int j=row; j >= i; j--){
           System.out.print("*");
       }
       
           System.out.println();
           
      }
    }
    
}
