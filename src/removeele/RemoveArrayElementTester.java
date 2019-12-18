package removeele;

import java.util.Collections;

public class RemoveArrayElementTester {

    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }

        //遍历数组知道一共有几种元素 作为返回值 elementCount
        int before = nums[0];
        int elementCount = 1;
        StringBuffer buf = new StringBuffer();
        for(int i = 1; i < nums.length; i ++){
            if(before == nums[i]){
            } else {
                buf.append(i + ",");
                elementCount ++;
                before = nums[i];
            }
        }
//        System.out.println(buf);

        String[] a = buf.length() > 0 ? buf.toString().split(",") : null;
        if(null != a && a.length > 0){
            for(int j = 0; j < a.length; j ++){
//                System.out.println("aaa"+a[j]);
                int s = Integer.valueOf(a[j]);
//                System.out.println("aaa"+a[j]);
                int temp = nums[j + 1];
                nums[j + 1] = nums[s];
                nums[s] = temp;
            }
        }


        for(int num : nums){
            System.out.print(num + ",");
        }


        //记录位置
        return elementCount;
    }

    public static void main(String[] args) {
        RemoveArrayElementTester tr = new RemoveArrayElementTester();
//        int caseResult = tr.removeDuplicates(new int[]{1, 1 ,2 ,2, 3});
//        System.out.println(caseResult);

        int caseResult1 = tr.removeDuplicates(new int[]{0,0,0,0,0,1,2,2,3,3,4,4});
        System.out.println(caseResult1);

        int caseResult2 = tr.removeDuplicates(new int[]{1,1,2});
        System.out.println(caseResult2);
        int caseResult3 = tr.removeDuplicates(new int[]{1});
        System.out.println(caseResult3);



    }
}
