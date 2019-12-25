package checkposibility;

public class CheckPossibilityTester {
//3 4 2 3
    public boolean checkPossibility(int[] nums) {
        if (null == nums || nums.length == 0) {
            return false;
        }
        int k = 0;
        for (int i = 0; i < nums.length; i ++) {
            int temp = nums[i];
            if (i + 1 < nums.length) {
                nums[i] = nums[ i + 1];
            }
            if (i - 1 > 0 && i == nums.length - 1) {
                nums[i] = nums[i - 1];
            }

            for (int j = 0; j < nums.length; j ++) {
                if (j + 1 < nums.length) {
                    if (nums[ j + 1] - nums[j] >= 0) {
                        k ++;

                    } else {
                        k = 0;
                        nums[i] = temp;
                        break;
                    }
                }
            }

            if (k == nums.length - 1) {
                return true;
            }
        }

        return false;
    }

    public boolean checkPossiblity2(int[] nums) {
        int cnt = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                int tmp = nums[i];
                if (i >= 1) {
                    nums[i] = nums[i - 1];
                } else {
                    nums[i] = nums[i + 1];
                }
                if (nums[i] > nums[i + 1]) {
                    nums[i] = tmp;
                    nums[i + 1] = nums[i];
                }
                cnt++;
                if (cnt == 2) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        CheckPossibilityTester ct = new CheckPossibilityTester();
        boolean case7 = ct.checkPossiblity2(new int[]{1,2,4,5,3});
        System.out.println(case7);
//        boolean result = ct.checkPossibility(new int[]{1,2,3,4});
//        System.out.println(result);
//
//        boolean case2 = ct.checkPossibility(new int[]{3,2,3,4});
//        System.out.println(case2);
//
//        boolean case3 = ct.checkPossibility(new int[]{3,5,3,6});
//        System.out.println(case3);
//
//        boolean case4 = ct.checkPossibility(new int[]{6,5,4});
//        System.out.println(case4);
////
        boolean case5 = ct.checkPossibility(new int[]{3, 4, 2 ,3});
        System.out.println(case5);
//
        boolean case6 = ct.checkPossibility(new int[]{4, 2 ,3});
        System.out.println(case6);
        boolean case9 = ct.checkPossibility(new int[]{1});
        System.out.println(case9);


    }
}
