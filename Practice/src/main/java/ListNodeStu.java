/**
 * @Author: hedy
 * @Date: 2022/04/30/14:37
 * @Description:
 */
public class ListNodeStu {
    public static class ListNode{
        int val ;// 当前节点值
        ListNode next = null;//下一个值的指针
        ListNode(int val ){this.val = val;}//获取当前节点值
    }
    public static void main(String[] args) {
        ListNode list = new ListNode(0);
        list.next = new ListNode(3);//赋值
        System.out.println(list.val);
        ListNode second = list.next;
        int nextValue = second.val;
        System.out.println(nextValue);
    }
}
