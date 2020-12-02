import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class HelloWorld {
    public static void main(String[] args) {

        ListNode ln1=new ListNode(1);

        ListNode ln2=new ListNode(3);
        ListNode ln3=new ListNode(2);
        ln1.next=ln2;ln2.next=ln3;
        reversePrint(ln1);


    }

    public static int[] reversePrint(ListNode head) {
        List<Integer> list=new ArrayList();
        while (head!=null){
            list.add(head.val);
            head=head.next;
        }
        int[] array=new int[list.size()];
        for (int i = list.size()-1,j=0; i >=0 ; i--,j++) {
            array[j]=list.get(i);
        }
        return array;
    }
}

 class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
