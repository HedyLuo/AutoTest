/**
 * Created with IntelliJ IDEA.
 *
 * @Author: hedy
 * @Date: 2022/04/29/22:06
 * @Description:string类
 */
public class StringStu {
    public static void main(String[] args) {
        //String类值无法改变
        String s1 = "i love java";
        String s2 = new String("i love java");//string对象
        String s3 = s1; //相同引用；
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        //字符串数组
        char [] s = {'j','a','v','a'};
        String str = new String(s);
        System.out.println(str); //java
        System.out.println(s1.length());//字符串长度
        System.out.println(s1.equals(s2));//比较字符串

        System.out.println(s1.toCharArray());//转换成字符串数组
        System.out.println(s1.charAt(3));//返回指定索引处的字符，打印o
    }
}
