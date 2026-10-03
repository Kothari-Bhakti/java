
package assignment2;


 class vehical 
 {
 
     void displayinfo()
     { 
      System.out.println("vehical class method ...");   
     }
 
 }

class car extends vehical{
       
       void displayinfo()
      { 
      System.out.println(" car class method ...");   
      }

}
public class vehical_car_inherit_class {
    public static void main(String[] args) {
        vehical v= new vehical();
        v.displayinfo();
        car c = new car();
        c.displayinfo();
    }
    
}
