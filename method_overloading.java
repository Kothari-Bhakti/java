
package assignment1;
class demo
{
  void disp(int a, int b)
  {
      System.out.println("a="+a);
      System.out.println("b="+b);
  }
  
  void disp(float a, float b)
  {
      System.out.println("a="+a);
      System.out.println("b="+b);
  }
  
}


public class method_overloading {
    public static void main(String[] args) {
        demo d= new demo();
        d.disp(10,20);
        d.disp(10.5f,20.5f);
    }
    
}
