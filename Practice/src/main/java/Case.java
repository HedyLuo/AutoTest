import java.util.HashMap;
import java.util.Map;

/**
 * @Author: hedy
 * @Date: 2022/05/07/00:24
 * @Description:
 */
public class Case {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        map.put(2,3);
        System.out.println(map);
        map.put(4,5);
        System.out.println(map);
    }
}
