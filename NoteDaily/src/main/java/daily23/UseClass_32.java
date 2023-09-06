package daily23;

/**
 * @Author: hedy
 * @Date: 2023/08/26/22:00
 * @Description: 引用类
 */
public class UseClass_32 {
    public static void main(String[] args) {
        //创建名为cc1的类CreatClass_31的一个实例，实例instance
        CreatClass_31 cc1 = new CreatClass_31();
        //初始值为原类成员初始值
        System.out.println(cc1.id);
        cc1.id=1;
        cc1.name="可乐";
        cc1.count=90;
        cc1.price = 3.5;
        CreatClass_31 cc2 = new CreatClass_31();
        cc2.id =2;
        cc2.name="奶茶";
        cc2.count = 30;
        cc2.price = 9.9;
    }
}
