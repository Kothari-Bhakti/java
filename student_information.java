
package assignment1;

import java.util.Scanner;
public class student_information {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        int total=0; 
        int average;
        String name;
        int roll_num;
        int marks[]= new int[3];
        
        System.out.print("enter your name:");
        name=sc.next();
        
        System.out.print("enter your roll number:");
        roll_num= sc.nextInt();
        
        for (int i = 0; i <3; i++) {
            System.out.print("ENTER YOUR MARKS:");
            marks[i]=sc.nextInt();  
             total+=marks[i];
             
        }
        average =total/3 ;
       
        System.out.println("name is:"+name);
        System.out.println("roll number is:"+roll_num);
        System.out.println("total is:"+total);
        System.out.println("average of total:"+average);
     
        
    }
    
}
