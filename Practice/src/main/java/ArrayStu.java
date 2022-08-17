import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: hedy
 * @Date: 2022/04/24/23:44
 * @Description:数组
 */
public class ArrayStu {
    public static void main(String[] args) {
        int [] array = new int[3]; //10表示数组容量，则其中可以10个整数，下标最大到9
        array[0] = 1;
        array[2] = 2;
        int [] A = {4,5,6,7};
        int [] B = {8,2,1,3};
        int len =A.length;
        int [] pre = new int[len*len];
        for(int i =0;i<len;i++){
            for(int j =0;j<len;j++){
                pre[i]=A[i]+B[j];
            }
        }
        System.out.println(Arrays.toString(pre));
        int m = A.length-1;
        System.out.println(A[m--]);
       //for-each循环遍历数组
        for (int value : array) {
            System.out.println(value + " ");
        }
        // 遍历数组
        for (int i =0; i<array.length; i++ ){
            System.out.println(array[i]);

        }
        System.out.println(Arrays.toString(new int[]{array[0], array[2]}));


        //ArrayList类：可动态添加或修改的数组
        ArrayList<String> list = new ArrayList<String>();
        list.add("i");
        list.add("love");
        list.add("java");
        //替换方法
        list.set(2,"jacoco");//把Java替换成jacoco
        System.out.println(list);
        //遍历
        for(int i =0 ; i<list.size(); i++){
            System.out.println(list.get(i));//取出对应下标的值
        }
        for(String i :list){
            System.out.println(i);
        }
    }
}
