import java. util. LinkedList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public void add(){
    }
    public static void main(String[] args) {
        Map<Integer, Object> address = new HashMap<>();
        Map<Integer, Boolean> repeated = new HashMap<>();

        for (int i = 0; i < 26; i++) {
            address.put(i, null);
            repeated.put(i, false);
        }

    }
}