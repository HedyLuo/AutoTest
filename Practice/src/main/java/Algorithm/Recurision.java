package Algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: hedy
 * @Date: 2022/05/30/22:17
 * @Description:
 */
public class Recurision {
    //39.组合总和
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    LinkedList<Integer> track = new LinkedList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backTrack(candidates,0,target);
        return res;
    }
    public void backTrack(int[] candidates,int start,int target){
        if(target < 0) return ;
        if(target == 0 ) {
            res.add(new ArrayList<Integer>(track));
            return ;
        }
        for(int i =start;i<candidates.length;i++){
            if(candidates[i] <=target){
                track.addLast(candidates[i]);
                backTrack(candidates,i,target-candidates[i]);
                track.removeLast();
            }
        }
    }
}
