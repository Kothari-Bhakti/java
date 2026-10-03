package assignment1;
class demo1{
    demo1(){
        System.out.println("default constructor");   
    }
    
    demo1(int a){
            System.out.println("parameterise constructor"+a);
    }
}

public class constructor_overloading {
    public static void main(String[] args) {
        demo1 d=new demo1();
        demo1 d2=new demo1(10);
    }
    
}
