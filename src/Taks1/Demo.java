package Taks1;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> testNames = new ArrayList<>(List.of("Ivan","Artem","Volodimir","Olena","Oleg","Andrii","Ruslan"));
        System.out.println(OddIndexNames.oddIndexString(testNames));
    }
}
