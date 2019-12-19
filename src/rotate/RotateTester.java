package rotate;

import java.util.Arrays;
import java.util.List;

public class RotateTester {

    public void rotate(int[] nums, int k) {
        if (null == nums || nums.length == 0 || k == 0) {
            //输出;
            return;
        }
        int numLength = nums.length;
        if(nums.length == k){
            //输出
            return;
        }
        int rotateCount = k % numLength;
        int [] endArray = new int[rotateCount];
        for(int i = numLength - rotateCount, j = 0; i < numLength; i ++){
            endArray[j] = nums[i];
            j ++;
        }
        int[] result = Arrays.copyOfRange(nums, 0 , numLength - rotateCount);
        int [] allArray = new int[nums.length];
        for(int index = 0, jk = 0; index < allArray.length; index ++){
            if(index < rotateCount){
                allArray[index] = endArray[jk];
            } else if (index == rotateCount){
                jk = 0;
                allArray[index] = result[jk];
            } else {
                allArray[index] = result[jk];
            }
            jk ++;

        }
        for(int m = 0; m < nums.length; m ++){
            nums[m] = allArray[m];
        }
    }

    private void printArray(int[] array){
        System.out.print("[");
        for(int i = 0; i < array.length; i ++){
            System.out.print(array[i]);
            if(i < array.length - 1){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        RotateTester rt = new RotateTester();
        int[] inputArray = new int[]{1, 2, 3, 4};
//        rt.rotate(inputArray, 1);

        int[] inputTestCase2 = new int[]{1, 20, 13, 43};
        rt.rotate(inputTestCase2, 2);

        rt.rotate(inputTestCase2, 4);
        rt.rotate(inputTestCase2, 6);
        rt.rotate(inputTestCase2, 8);

        rt.rotate(inputTestCase2, 0);

        int[] inputTestCase3 = new int[]{1,2,3,4,5,6,7};
        rt.rotate(inputTestCase3, 3);
        rt.printArray(inputTestCase3);
    }
}
