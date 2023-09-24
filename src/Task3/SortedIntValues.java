package Task3;

import java.util.Arrays;
import java.util.List;

public class SortedIntValues {
    public static void printIntValuesSorted(String [] values){
        List<String>result  = Arrays.stream(values)
                .flatMap(x->Arrays.stream(x.split(",")))
                .map(String::strip)
                .sorted()
                .toList();

        StringBuilder sb = new StringBuilder("\"");
        for (String s : result) {
            sb.append(s);
            if(result.indexOf(s)==result.size()-1){
                sb.append("\"");
            }
            else{
                sb.append(", ");
            }
        }
        System.out.println(sb.toString());
    }
}
