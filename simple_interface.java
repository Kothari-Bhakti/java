
package assignment2;
interface  simple
{
  void sayhello();
}
class welcome implements simple {
        public  void sayhello(){
            System.out.println(" hello welcome  to  java interface ..");   
        }
        
        public static void main(String[] args) {
        welcome   w = new welcome();
        w.sayhello();
    }
}

