import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 3;
        StaticArrayTest staticArrayTest = new StaticArrayTest();
        staticArrayTest.insertMiddle(arr,2,1,2);
        staticArrayTest.removeMiddle(arr,0,3);
        staticArrayTest.insertEnd(arr,4,2);
        staticArrayTest.removeEnd(arr,3);
        System.out.println(Arrays.toString(arr));
    }
}