public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode, Integer> hm = new HashMap<ListNode, Integer>();
        
        while(true){
		
          if(head == null){
              return null;
          }
		  
          if(hm.containsKey(head)){
              return head;
          }else{
              hm.put(head, 0);
              head = head.next;
          }
        }
    }
}