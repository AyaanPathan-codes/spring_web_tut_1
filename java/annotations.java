@FunctionalInterface
interface A{
    void show(int i);
  
}

// class B implements A{
//     public void show(){
//         System.out.println("In show");
//     }
// }
public class annotations {
    public static void main(String[] args) {
         A obj = i -> 
                System.out.println("In show"+ i); 
                
            obj.show(5);
    }      
}
