
package assignment2;

interface vehicale{
    int speedlimit=80;
    void run();
       
}
class bike implements vehicale{

 public void run(){
     System.out.println("bike is running safely..");
         System.out.println("  speed limit:"+speedlimit+ "km/hr");
 }
    public static void main(String[] args) {
        bike b= new bike();
        b.run();
    }
}


