package removeele;

public class RemoveDuplicatesTester {

    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }

        //遍历数组知道一共有几种元素 作为返回值 elementCount
        int before = nums[0];
        int elementCount = 1;
        for(int i = 1, j = 1; i < nums.length; i ++){
            if(before == nums[i]){
            } else {
                int temp = nums[i];
//                nums[i] = nums[j];
                nums[j] = temp;
                j++;
                elementCount ++;
                before = nums[i];
            }
        }

        for(int num : nums){
            System.out.print(num + ",");
        }


        //记录位置
        return elementCount;
    }

    public static void main(String[] args) {
        RemoveDuplicatesTester tr = new RemoveDuplicatesTester();
        int caseResult1 = tr.removeDuplicates(new int[]{0,0,0,0,0,1,2,2,3,3,4,4});
        System.out.println(caseResult1);

        int caseResult2 = tr.removeDuplicates(new int[]{1,1,2});
        System.out.println(caseResult2);
        int caseResult3 = tr.removeDuplicates(new int[]{1});
        System.out.println(caseResult3);
    }
}
