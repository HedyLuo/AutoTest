package daily23;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Author: hedy
 * @Date: 2023/09/09/20:08
 * @Description: 反射
 */
public class ReflectionLearn_90 {
    //TODO 成员变量
    String name;
    public void phone(){
        // TODO 临时变量，通过反射不能获取
        String name;
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Class<ReflectionLearn_90> clazz = ReflectionLearn_90.class;
        Method methodPhone = (Method) clazz.getDeclaredMethod("phone");
    }

}
