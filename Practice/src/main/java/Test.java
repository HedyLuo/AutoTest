import java.util.HashMap;

/**
 * @Author: hedy
 * @Date: 2022/05/01/15:59
 * @Description:
 */

public class Test {
    public static int subarraySum(int[] nums, int k) {
        int count =0;
        int pre = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i =0;i<nums.length;i++){
            pre +=nums[i];
            if(map.containsKey(pre-k)){
                count += map.get(pre-k);
            }
            map.put(pre,map.getOrDefault(pre,0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4, 5};
        System.out.println(subarraySum(nums,5));
    }
}
