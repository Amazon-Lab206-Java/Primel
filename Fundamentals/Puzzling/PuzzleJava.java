import java.util.*;

public class PuzzleJava {
    public ArrayList<Integer> puzz1(){
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        int[] arr = {3,5,1,2,7,9,8,13,25,32};
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > 10){
            newArr.add(arr[i]);
            }
            sum+=arr[i];
        }
        System.out.println("Sum: " + sum);
        System.out.println(newArr);
        return newArr;
    }
    public ArrayList<String> puzz2(){
        ArrayList<String> newArr = new ArrayList<String>();
        String[] arr = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        ArrayList<String> arrAsList = new ArrayList<>(Arrays.asList(arr));
        Collections.shuffle(arrAsList);
        System.out.println(arrAsList);
        for(int i = 0; i<arr.length; i++){
            if(arr[i].length() > 5){
                newArr.add(arr[i]);
            }
        }
        System.out.println(newArr);
        return newArr;
    }
    public void puzz3(){
        String[] alpha = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String[] vowels = {"a", "e", "i", "o", "u" };
        ArrayList<String> alphaAsList = new ArrayList<String>(Arrays.asList(alpha));
        Collections.shuffle(alphaAsList);
        System.out.println("First " + alphaAsList.get(0) + " Last " + alphaAsList.get(25));
        if(Arrays.asList(vowels).contains(alphaAsList.get(0))){
            System.out.println("I begin with a vowel!");
        }
    }
    public ArrayList<Integer> puzz4(){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Random randomArr = new Random();
        for(int i = 0; i<10; i++){
            arr.add(randomArr.nextInt(101 - 55) + 55);
        }
        System.out.println(arr);
        return arr;
    }
    public ArrayList<Integer> puzz5(){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Random randomArr = new Random();
        for(int i = 0; i<10; i++){
            arr.add(randomArr.nextInt(101 - 55) + 55);
        }
        Collections.sort(arr);
        System.out.println(arr);
        System.out.println("Min: " + arr.get(0));
        System.out.println("Max: " + arr.get(9));
        return arr;
    }
    public static String puzz6(){
        String[] alpha = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        ArrayList<String> alphaAsList = new ArrayList<String>(Arrays.asList(alpha));
        Random randLetter = new Random();
        String randString = "";
        for(int i = 0; i<5; i++){
            randString = randString.concat(alphaAsList.get(randLetter.nextInt(alphaAsList.size())));
        }
        System.out.println(randString);
        return randString;
    }

    public void puzz7(){
        ArrayList<String> newStringArr = new ArrayList<String>();
        for(int i = 0; i<10; i++){
            newStringArr.add(PuzzleJava.puzz6());
        }
        System.out.println(newStringArr);
    }

}