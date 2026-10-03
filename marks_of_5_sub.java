
package assignment1;
import java.util.Scanner;

public class marks_of_5_sub {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
      
       int size = sc.nextInt();
       int marks[]= new int[size];
       int total=0;
       int average;
       for (int i = 0; i <size; i++) {
           System.out.print("enter your marks for sub "+i);
           marks[i]=sc.nextInt();    
        }
        for (int i = 0; i <size; i++) {
            System.out.println("marks of sub"+i+""+marks[i]);
            total+=marks[i];
        }
        System.out.println("total is:"+total);
        average=total/5;
        System.out.println("average is:"+average);
       
    }
    
}
