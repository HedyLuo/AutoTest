package daily23;

/**
 * @Author: hedy
 * @Date: 2023/09/10/17:16
 * @Description: this 自引用
 */
public class ThisMethod_48 {
    int name=3;
    public void name1(int name){
        System.out.println("先调用方法name1值："+name);
        name = 6;
        System.out.println("局部变量name："+name);
    }
    public void name2(int name){
        System.out.println("先调用方法name2值："+name);
        System.out.println("this成员变量name："+this.name);
    }

    public static void main(String[] args) {
        ThisMethod_48 thisMethod_48 = new ThisMethod_48();
        thisMethod_48.name1(1);
        thisMethod_48.name2(1);
    }
}
