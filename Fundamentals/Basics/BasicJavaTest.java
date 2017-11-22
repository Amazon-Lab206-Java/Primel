import java.util.ArrayList;

public class BasicJavaTest {
    public static void main(String[] args){
        BasicJava basics = new BasicJava();

        basics.printAll();
        basics.printOdds();
        basics.printSum();
        int[] arr = {1, 3, 5, 7, 9, 13};
        basics.arrayIter(arr);
        basics.findMax(arr);
        basics.getAvg(arr);
        basics.oddArray();
        basics.greaterThan(arr, 5);
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        newArr.add(1);
        newArr.add(5);
        newArr.add(10);
        newArr.add(-2);
        basics.squared(newArr);
        basics.noNegs(newArr);
        basics.minMaxAvg(arr);
        basics.toFront(arr);
    }
}
