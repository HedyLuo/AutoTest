import java.util.Arrays;
import java.util.LinkedList;

/**
 * @Author: hedy
 * @Date: 2022/04/30/11:27
 * @Description:
 */
public class LinkedListStu {
   public static void main(String[] args){
       /*
       * 使用场景：
       * 1）循环迭代访问列表的某些元素
       * 2）需要频繁的在列表开头、中间、末尾添加和删除操作
       */
      // 创建一个string类型的链表
      LinkedList<String> l = new LinkedList<String>();
      l.add("i");
      l.add("love");
      l.add("java");
      System.out.println(l);//[i, love, java]
      l.addFirst("so");//[so, i, love, java]
      l.addLast("forever");//[so, i, love, java,forever]
      //移除remove
      System.out.println(l);//[so, i, love, java, forever]
      System.out.println(l.remove(4));//打印forever
      System.out.println(l.remove("so"));//返回true
      System.out.println(l);//[i, love, java]

      //遍历列表
      for (int size = l.size(), i = 0 ; i<size; i++){
         System.out.println(l.get(i));
      }
      //for-each遍历
      for(String i:l){
         System.out.println(i);
      }
   }
}
