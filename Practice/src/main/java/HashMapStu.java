import java.util.HashMap;
public class HashMapStu {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        // 添加hash值
        map.put(1,3);
        map.put(2,4);
        // 打印hashmap所有value
        System.out.println(map.values());

        //打印key和value
        for (Integer i : map.keySet()){
            System.out.println("key:"+ i +","+"value:"+ map.get(i));//获取key对应的value
        }
        //返回key对应的value,如果找不到则返回-1
        System.out.println(map.getOrDefault(1,-1));
        //查找key
        if(map.containsKey(1)){
            System.out.println("在hashmap中存在key为1的映射关系");
        }
        if(!map.containsKey(4)){
            System.out.println("在hashmap中不存在key为1的映射关系");
        }
        //返回所有key和value
        System.out.println(map.entrySet());
        //返回所有key
        System.out.println(map.keySet());
    }

}
