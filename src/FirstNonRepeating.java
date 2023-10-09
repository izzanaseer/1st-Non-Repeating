import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeating {
    private Map<Integer, Object> address;
    private Map<Integer, Boolean> repeated;

    public FirstNonRepeating() {
        address = new HashMap<>();
        repeated = new HashMap<>();

        for (int i = 0; i < 26; i++) {
            address.put(i, null);
            repeated.put(i, false);
        }
    }

    public void add(char c){
        int index = c - 'a' ;
    }
}
