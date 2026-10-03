
package assignment2;


class parent {

   parent()
   {
       System.out.println("parent class constructor  called..");   
   }

}
 class child extends parent {

child()
{
    System.out.println("child class constructor  called..");   
}

}

public class constructor_in_inherit {
    public static void main(String[] args) {
        child  obj= new  child();
        
    }
    
}
