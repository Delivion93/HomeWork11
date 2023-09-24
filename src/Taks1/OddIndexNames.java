package Taks1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

import static java.util.Arrays.stream;

public class OddIndexNames {


    public static String oddIndexString(List<String>names){

        List<String>numeredList = numerateList(names);
        List<String>namesList= IntStream.range(0, numeredList.size())
                .filter(i ->i%2!=0)
                .mapToObj(numeredList::get)
                .toList();

        StringBuilder sb = new StringBuilder();
        for (String s : namesList) {
            sb.append(s);
        }
        return sb.toString();
    }
    private static List<String> numerateList(List<String>list){
        AtomicInteger index = new AtomicInteger();

        List<String>result=IntStream.range(0, list.size())
                .mapToObj(list::get)
                .map(x->index.getAndIncrement()+"."+" "+x+", ")
                .toList();
        return result;
    }
}


