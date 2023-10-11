import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeating {
    private Map<Character, Node> characters;
    private Node head;
    private Node tail;
    private class Node {
        char data;
        Node prev;
        Node next;

        Node(char data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public FirstNonRepeating() {
        characters = new HashMap<>();
        head = new Node('0');
        tail = new Node('0');

        head.next = tail;
        tail.prev = head;
    }

    public void add(char c) {
        if (!characters.containsKey(c))
        {
            Node nn = new Node(c);
            nn.prev = tail.prev;
            nn.next = tail;
            tail.prev.next = nn;
            tail.prev = nn;
            characters.put(c, nn);
        }
        else if (characters.get(c) != null)
        {
            Node repeatedNn = characters.get(c);
            characters.put(c, null);
            repeatedNn.prev.next = repeatedNn.next;
            repeatedNn.next.prev = repeatedNn.prev;
        }
    }

    public char getFirstNonRepeating() {
        if (head.next == tail) {
            return '-';
        } else {
            return head.next.data;
        }
    }
}