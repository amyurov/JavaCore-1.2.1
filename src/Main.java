import java.util.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> intListSorted = new ArrayList<>();

        for (Integer x : intList) {
            if (x > 0) {
                if (x % 2 == 0) {
                    intListSorted.add(x);
                }
            }
        }
        intListSorted.sort(Comparator.naturalOrder());
        StringBuilder sb = new StringBuilder();
        for (Integer x : intListSorted) {
            sb.append(x);
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }
}
