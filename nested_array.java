                                                  
package classwork;
import java.util.Scanner;

public class nested_array {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int a[][]= new int [2][];
                 a[0]= new int [2];
                 a[1]= new int [3];
                 System.out.println("enter array element");
                 
             for (int i = 0; i < a.length; i++) {
                 for (int j = 0; j <a[i].length ; j++) {
                     a[i][j]=sc.nextInt();
                 }
            
        }
             System.out.println("array");
             for (int i = 0; i < a.length; i++)
             {
                 for (int j = 0; j <a[i].length; j++) 
                 {
                     
                     System.out.println(a[i][j]);
                     
                 }              
            
          }
     }              
}
