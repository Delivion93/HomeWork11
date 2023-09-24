package Task2;

import java.util.Comparator;
import java.util.List;

public class UpperCaseSortedNames {
    public static List<String> toUpperCaseAndSort(List<String>names){
        List<String>result = names.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .toList();
        return result;
    }
}
