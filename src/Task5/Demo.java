package Task5;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        Stream<String> first = Stream.of("A","B","C","D");
        Stream<String> second = Stream.of("E","F","G","H","I","J");
        List<String> result= StreamShuffle.zip(first,second).toList();
        System.out.println(result);

    }
}
