import java.util.*;

public class Map1 {
    public static void main(String[] args) {
        Map<String,Integer>map=new HashMap<>();

        map.put("Ayaan",1);
        map.put("Simran",2);
        map.put("Abrar",3);

      for( String key : map.keySet()){
        System.out.println(key + " " +  map.get(key));
      }

    }
}
