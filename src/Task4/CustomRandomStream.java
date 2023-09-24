package Task4;

import java.util.stream.Stream;

public class CustomRandomStream {
    public static Stream<Long> RandomStreamGenerator(long a, long c, long m){
        return Stream
                .iterate(System.currentTimeMillis(),
                        (x)->((x+a)/c*m));
    }
}
