import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello world!");
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
