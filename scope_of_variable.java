
package classwork;


public class scope_of_variable {
    int   b=5; // instance variable
   
     void disp(){
             int a = 10;// local scope variable
             System.out.println(b);
             System.out.println(a);
             
             if(a>b)
             {
               int j= 100;// block of variable 
                 System.out.println(j);
             }
             
     }
     void disp1(){
         
              System.out.println(b);
          
     }
    public static void main(String[] args) {
        
         scope_of_variable s1 = new  scope_of_variable();
         s1.disp();
         s1.disp1();
    }
    
}
