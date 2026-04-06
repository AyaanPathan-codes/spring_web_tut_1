package basics;
interface A{
     void display();
}
interface C extends A{
     void show();
}
class B implements C{
    public void display(){
        System.out.println("Hello World from class B");
    } 
    public void show(){
        System.out.println("Show method from interface C");
    }
}
   
public class inner {
        public static void main(String[] args) {
          C obj1 = new B();
          obj1.display();
        }
}
