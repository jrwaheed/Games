package at.ran.games.Testing;
import java.util.ArrayList;
import java.util.List;
public class Test1 {
    static void newMethod(List monkeyList) {
        for (Object element: monkeyList
             ) {
            System.out.println(element);
        };
    }
    public static void main(String[] args) {
        List<Integer> testList = new ArrayList<>();
        testList.add(12);
        testList.add(14332);
        testList.add(12);
        testList.add(34);
        testList.add(54);
        testList.add(7);

        newMethod(testList);
    }
}
