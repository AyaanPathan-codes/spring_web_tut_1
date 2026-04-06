public class exceptions {
    
    
    public static void main(String[] args) {
          try{

    int i =0;
    int j = 10/i;
    System.out.println(j);
    }catch(Exception e){
        System.out.println("Error runtime"+e);
    }
    }
  
}
