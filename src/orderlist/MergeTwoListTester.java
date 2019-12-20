package orderlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeTwoListTester {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (null == l1 && null == l2) {
            return null;
        }

        List<Integer> list = new ArrayList<Integer>(10);
        while (l1 != null) {
            list.add(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            list.add(l2.val);
            l2 = l2.next;
        }

        if (list != null && list.size() > 0) {
            Collections.sort(list);
        }
        ListNode firstNode = new ListNode(list.get(0));

        List<ListNode> alllist = new ArrayList<ListNode>(list.size());
        for(int i = 0; i < list.size(); i ++){
            ListNode lastNode = new ListNode(list.get(i));
            alllist.add(lastNode);
            if (i > 0) {
                alllist.get(i - 1).next = alllist.get(i);
            }
        }

        return alllist.get(0);
    }
}
