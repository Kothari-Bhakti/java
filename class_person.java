
package assignment2;

class person {
 void disp()
 {
    String  name="bhakti";
    int  age=19;
    
    
     System.out.println("person name:"+name);
      System.out.println("person age:"+age);
 }
}

class employee extends person{
  void disp1(){
   float salary=100000;
   String designation="manager";
    
      System.out.println("employee salary:"+salary);
       System.out.println("emp designation:"+designation);
  }

}
public class class_person {
    public static void main(String[] args) {
        employee emp = new employee();
        emp.disp();
        emp.disp1();
    }
}
