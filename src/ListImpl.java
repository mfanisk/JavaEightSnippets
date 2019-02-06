import java.util.*;

public class ListImpl {


    public static void main(String[] args) {
        List<String> myList = Arrays.asList("***","****","*","**");
        Comparator<String> logicLambda = (String one, String two) -> Integer.compare(one.length(), two.length());

        Collections.sort(myList, logicLambda);

        System.out.println(myList);
    }


}
