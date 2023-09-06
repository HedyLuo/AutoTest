package daily23;

import java.util.Collection;
import java.util.Objects;

/**
 * @Author: hedy
 * @Date: 2023/09/04/23:24
 * @Description: control+H 方法
 */
public class whatsCollection {
    private Object[] elements;
    private int curr;


    public whatsCollection(){
        elements = new Object[16];
        curr = 0;
    }
    public int size(){
        return curr;
    }

    public boolean contains(Object o){
        for(Object ele:elements){
            if(Objects.equals(ele,o)){
                return true;
            }
        }
        return false;
    }

    public void clear(){ curr =0;}

    public static void main(String[] args) {
        Collection collection = null;
    }
}
