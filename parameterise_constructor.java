
package assignment2;


 class demo
 {
       int a;
       demo( int a )
       {
           this.a=a;
           System.out.println("a ="+a);
       }
 }

class demo2 extends demo
{
    int b;
    demo2(int a,int  b)
    {
        super(a);
        System.out.println(" b is:"+b);
    }
}

public class parameterise_constructor {

     public static void main(String[] args) {
        demo2 d1= new demo2(12,30);
        demo d2= new demo(10);
    }
    
    
}
