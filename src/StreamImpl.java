import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StreamImpl {

    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(2,3,4,5);

        // demonstration of map method
        List<Integer> square = number.stream().map(x -> x*x).
                collect(Collectors.toList());
        System.out.println(square);

        int even =
                number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);

        System.out.println(even);
    }
}
