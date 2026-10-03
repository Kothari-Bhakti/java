
package assignment1;
import java.util.Scanner;
public class dynamic_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]= new int[5];
        
        for (int i = 0; i <5; i++) {
            System.out.print("enter value:");
            arr[i]=sc.nextInt();
        }
        
        for (int i = 0; i <5; i++) {
            System.out.println("value is:"+arr[i]);
            
        }
    }
    
    
}
