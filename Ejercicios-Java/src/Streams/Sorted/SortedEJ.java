package Streams.Sorted;

import java.util.Arrays;
import java.util.List;

public class SortedEJ {
    public static void main(String[] args) {
        List<Integer> Ages = Arrays.asList(15, 55, 23, 12, 40);

        List<Integer> AgesOrder = Ages.stream()
                .sorted()
                .toList();

        System.out.println(AgesOrder);
    }
}
