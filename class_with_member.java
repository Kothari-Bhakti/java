
package classwork;


  class stud
{
    String color;
     void disp()
     {
         System.out.println("color name is:"+color);
     }
        
}
public class class_with_member
{
       public static void main(String[] args) {
        stud s = new stud();
        s.color="red";
        s.disp();
    }

}