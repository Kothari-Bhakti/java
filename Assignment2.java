
package assignment2;
class parents {
  public  void disp()
  {
       System.out.println(" parent class");
  }
     
  class dog extends parents{
          
    public void  display()
     {
           System.out.println("dog class");  
     }
     
 }

public class Assignment2 {

    public static void main(String[] args) {
        dog d = new dog();
        d.disp();
        
    }
     
    }
    
}
