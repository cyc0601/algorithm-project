package mergeorderlist;

import java.util.Arrays;

public class MergeTwoListTester {

    public static int[] inputArray = new int[] {1,2,3,4,0,0,0,0,0,0,0,0,0,0,0,0};

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (null == nums1) {
            return;
        }
        if (null == nums2 || n == 0) {
            return;
        }

        for (int i = 0; i < n; i ++) {
            nums1[(m-1) + 1 + i] = nums2[i];
        }
        //nums1 = Arrays.copyOfRange(nums1, 0, m + n);
        Arrays.sort(nums1);
    }


    public static void main(String[] args) {
        MergeTwoListTester mt = new MergeTwoListTester();

        mt.merge(inputArray, 3, new int[]{2,3,4}, 2);
//        for(int i : inputArray){
//            System.out.print(i);
//        }
//        System.out.println();
    }
}
