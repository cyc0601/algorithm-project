package util;

public abstract class OutPutUtil {

    public static void print(int[] input){
        for(int element : input){
            System.out.print(element + ",");
        }
        System.out.println();
    }
}
