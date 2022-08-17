package Algorithm;

import com.sun.xml.internal.ws.api.model.ExceptionType;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * @Author: hedy
 * @Date: 2022/05/21/15:40
 * @Description:
 */
public class HashMapTi {
    /*
    * 560.和为K的子数组
    * 前缀和+哈希表解法
    * */
    public static int subarraySum(int[] nums, int k) {
        int pre = 0,count =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        //记录下标为0的数，前缀和为0，个数为1个
        map.put(0,1);
        for(int i:nums){
            pre += i;
            if(map.containsKey(pre-k)){
                count += map.get(pre-k);
            }
            map.put(pre,map.getOrDefault(pre,0)+1);
        }
        return count;

    }
    //前缀和解法
    public int subarraySum1(int[] nums, int k) {
        int len = nums.length;
        //前缀和数组
        int[] pre = new int[len+1];
        pre[0] = 0;
        for(int i=0;i<len;i++){
            pre[i+1] =pre[i]+nums[i];
        }
        int count =0;
        for(int i =0;i<len;i++){
            for(int j =i;j<len;j++){
                if(pre[j+1]-pre[i]==k){
                    count ++;
                }
            }
        }
        return count;
    }


    //3.无重复最长字串
    //数组的话写HashMap<Integer,Integer>
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map =new HashMap<>();
        int max = 0;
        for(int i = 0,j=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1);
            }
            max = Math.max(max,i-j+1);
            map.put(s.charAt(i),i);
        }
        return max;
    }

    //找到缺失的第一个正整数
    public int minNumberDisappeared (int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, 1);
        }
        //注意从1开始是为了查找连续数组后1位，如[1,2]的情况下
        int res = 1;
        while(map.containsKey(res))
            res++;
        return res;
    }


    //数组中只出现1次的两个数字，并且升序返回结果
    public int[] FindNumsAppearOnce (int[] array) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        //统计各个数出现的次数
        for(int i:array){
        //for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            } else {
                map.put(array[i], 1);
            }
        }
        //找到频次为1的数字
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int value : array) {
            if (map.get(value) == 1)
                res.add(value);
        }
        return res.get(0) > res.get(1) ?
                new int[]{res.get(1), res.get(0)} : new int[]{res.get(0), res.get(1)};
    }
    double a = Double.MAX_VALUE;
    double b = Double.MIN_VALUE;
    public double max(double[] arr) {

        Arrays.sort(arr);
        try {
            if (arr[0] * arr[1] <= a || arr[0] * arr[1] >= b)
                return arr[0] * arr[1];
        }catch(Exception e){
            System.out.println("不符合长度范围");
        }
        return 0;
    }

    public static void main(String[]args){
        int[] c = new int[]{1,1,4,5,6};
        Arrays.sort(c);
        System.out.println(c);
        System.out.println(subarraySum(c,1));
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        if(map.containsKey(1))
            System.out.println("success:"+map.containsKey(0));
    }
}


