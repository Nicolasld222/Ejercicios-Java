package Streams.Map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapEJ {
    public static void main(String[] args) {
        List<Integer> listaNum = Arrays.asList(10, 15, 20, 90);

        List<Integer> SumaMismo = listaNum.stream()
                .map(x -> x + x)
                .collect(Collectors.toList());

        System.out.println(SumaMismo);
    }
}
