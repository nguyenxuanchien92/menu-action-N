package models;

public class ManageOption {

    private static final int RANGE = 10;
    private int[] arr = new int[RANGE];


    public boolean isOdd(int number) {
        if (number > 0) {
            return (number % 2 != 0) ? true : false;
        }
        return false;
    }

    private void addNumbers(int number) {
        int[] newArray = new int[RANGE +1];
        for (int i : arr){
            newArray[i] = arr[i];
        }
        newArray[RANGE] = number;
    }

    public boolean isPrime(int number) {
//       ....
       return true;
    }
}
