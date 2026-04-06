import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class Stream1 { 
    public static void main(String args[]){
        
        List<Integer> nums = Arrays.asList(51,2,3);
       Stream<Integer> sortedValues =  nums.stream()
        .filter(n -> n%2 ==0)
        .sorted();
        
        sortedValues.forEach(n -> System.out.println(n));
    }
}