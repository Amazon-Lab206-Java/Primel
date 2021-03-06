import java.util.ArrayList;

public class BasicJava{
    public void printAll(){
        for( int i = 0; i<=255; i++){
            System.out.println(i);
        }
    }
    public void printOdds(){
        for( int i = 0; i<=255; i++){
            if(i % 2 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
    public void printSum(){
        int counter = 0;
        for (int i = 0; i<=255; i++){
            counter += i;
            System.out.println("New Number " + i + " Sum: " + counter);
        }
    }
    public void arrayIter(int[] arr){
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public void findMax(int[] arr){
        int temp = arr[0];
        for (int i = 0; i<arr.length; i++){
            if(arr[i] > temp){
                temp = arr[i];
            }
            continue;
        }
        System.out.println(temp);
    }
    public void getAvg(int[] arr){
        int sum = 0;
        for (int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum / arr.length);
    }
    public void oddArray(){
        ArrayList<Integer> y = new ArrayList<Integer>();
        for( int i = 1; i<=255; i++){
            if(i % 2 != 0){
                y.add(i);
            }
        }
        System.out.println(y);
    }
    public void greaterThan(int[] arr, int num){
        int counter = 0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i] > num){
                counter += 1;
            }
            continue;
        }
        System.out.println(counter);
    }
    public void squared(ArrayList<Integer> arr){
        for(int i = 0; i<arr.size(); i++){
            arr.set(i, arr.get(i)* arr.get(i));
        }
        System.out.println(arr);
    }
    public void noNegs(ArrayList<Integer> arr){
        for(int i = 0; i<arr.size(); i++){
            if (arr.get(i) < 0){
                arr.set(i, 0);
            }
            continue;
        }
        System.out.println(arr);
    }
    public void minMaxAvg(int[] arr){
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        int max = arr[0];
        int min = arr[0];
        int avg = 0;
        for (int i = 0; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }
            avg += arr[i];
        }
        newArr.add(max);
        newArr.add(min);
        newArr.add(avg / arr.length);
        System.out.println(newArr);
    }
    public void toFront(int[] arr){
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for(int i = 1; i<arr.length; i++){
            newArr.add(arr[i]);
        }
        newArr.add(0);
        System.out.println(newArr);
    }
}