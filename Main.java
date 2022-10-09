import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myArray = new int[]{3, 5, 7 ,2, -1, -8, 2, 1, 5, 4};



        for(int i=0; i < myArray.length / 2; i++){
            int buffer = myArray[i];
            myArray[i]=myArray[myArray.length -1 -i];
            myArray[myArray.length - 1 -i] = buffer;

        }
        System.out.println("Array: " + Arrays.toString(myArray));
    }
}