package Task5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamShuffle {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
        List<T> firstList = first.toList();
        List<T> secondList = second.toList();
        List<T>result = new ArrayList<>();
        int resultSize =0;
        if(firstList.size()<secondList.size()){
            resultSize=firstList.size();
        } else if (secondList.size()<firstList.size()) {
            resultSize= secondList.size();
        }
        else {
            resultSize=firstList.size();
        }
        for (int i = 0; i <resultSize ; i++) {
            result.add(firstList.get(i));
            if(i==resultSize-1){
                break;
            }
            result.add(secondList.get(i));
        }
        return result.stream();

    }
}
