import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class immutableArrayDataType {

    public static void main(String[] args) {

        // using Collections.unmodifiableList()
        List<String> someList = new ArrayList<>(Arrays.asList("some", "all", "few", "none"));
        List<String> unmodifiableList = Collections.unmodifiableList(someList);

        // Not possible since the array created is immutable
        // unmodifiableList.add("any");
        System.out.println(unmodifiableList);

        System.out.println();

        // using List.of()
        List<Integer> variables = List.of(2, 3, 4, 5, 6);
        // Not possible since the list created is immutable
        // variables.add(9);
        System.out.println(variables);
    }
}