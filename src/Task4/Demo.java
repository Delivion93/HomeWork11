package Task4;

import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        long a = 25214903917L;
        long c =11L;
        long m =(long)Math.pow(2,48);

        System.out.println(CustomRandomStream.RandomStreamGenerator(a, c, m).limit(10).collect(Collectors.toList()));


    }
}
