
package assignment2;
// parent class
class animal{
    
    void eat()
    {
        System.out.println("animal is eating ");
    }
         
}
// child class
class dog  extends animal
{

     void bark()
     {
         System.out.println("dog is barking ");
     }
     

}

// main class 

public class single_inheritan {
    public static void main(String[] args) {
        dog d= new dog();
        d.eat();// inherited method 
        d.bark();// child class method 
    }
    
    
}
