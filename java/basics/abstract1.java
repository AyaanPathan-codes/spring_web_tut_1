package basics;


   abstract class car{
        abstract public void start();
        public void music(){
            System.out.println("Play music");
        }

    }
    class GWagon extends car{
        public void start(){
            System.out.println("Start the car");
        }
    }

public class abstract1 {
    public static void main(String[] args) {

        car c = new GWagon();
        c.start();
        c.music();
    }
}
