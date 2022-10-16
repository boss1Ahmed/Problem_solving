package Problems.node;

public class AddNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode resultnode = new ListNode();
        ListNode currentnode = new ListNode(0);
        int i= 0;

        while (l1!=null || l2!=null){
            ListNode nextnode = new ListNode(0);
            int sum = (l1==null? 0 : l1.val) + (l2==null? 0 : l2.val) + currentnode.val;

            if((l1!=null && l1.next!=null) || (l2!=null && l2.next!=null) || sum>9)             {
                currentnode.next = nextnode;
            }
            if (sum<=9){
                currentnode.val = sum;
            }else {
                currentnode.val = sum%10;
                currentnode.next.val = 1;
            }
            if (i==0){
                resultnode = currentnode;
            }

            currentnode = nextnode;
            l1= (l1==null ? null : l1.next);
            l2= (l2==null ? null : l2.next);
            i++;
        }
        return resultnode;
    }
}
