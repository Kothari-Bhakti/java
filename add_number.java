
package assignment1;

import java.util.Scanner;

public class add_number {
     public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("enter value for a:");
        int a =sc.nextInt();
        
        System.out.println("enter value for b:");
        int b =sc.nextInt();
        int ans =a+b;


        System.out.println(" value of a is:"+a);
        System.out.println( "value of b is :"+b);
        System.out.println("addition is :"+ans);
        
            
        
    }
    
}
