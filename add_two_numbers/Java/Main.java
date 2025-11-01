import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {}
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 1. iterate over the singly linked list and append elements into a string
        // 2. reverse string and then convert the string into a 32 bit integer
        // 3. add both 32 bit integers to get the result
        // 4. convert integer to string and iterate over string last to first
        // 5. while iterating create a singly linked list with items
        // 6. return singly linked list headNode
        String l1Result = "";
        String l2Result = "";
        while (l1 != null) {
            l1Result += l1.val;
            l1 = l1.next;
        }
        while (l2 != null) {
            l2Result += l2.val;
            l2 = l2.next;
        }
        BigInteger l1Integer = new BigInteger((new StringBuilder(l1Result)).reverse().toString());
        BigInteger l2Integer = new BigInteger((new StringBuilder(l2Result)).reverse().toString());
        BigInteger resultInteger = l1Integer.add(l2Integer);
        
        String resultStr = String.valueOf(resultInteger);
        ListNode headNode = null;
        ListNode currentNode = null;
        for (int i = resultStr.length() - 1; i >= 0; i--) {
            if (i == resultStr.length() - 1) {
                headNode = new ListNode(resultStr.charAt(i) - '0');
                currentNode = headNode; 
                continue;
            }
            currentNode.next = new ListNode(resultStr.charAt(i) - '0');
            currentNode = currentNode.next;
        }
        return headNode;
    }
}
