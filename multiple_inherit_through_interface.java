
package assignment2;

interface a
{
    void displayA();
    
}
interface   b{
    void displayB();   
}
 class  C implements a,b        
 {
     
 public void displayA(){
     System.out.println(" A class method ");   
 }
 
 public  void displayB(){
     System.out.println("B class method ");   
 }
 
 public void displayC(){
     System.out.println("C class method ");   
 }
 }
public class multiple_inherit_through_interface   
{
    
    public static void main(String[] args) {
        
      C c1= new C();
      c1.displayA();
      c1.displayB();
      c1.displayC();
    }   
    
}
