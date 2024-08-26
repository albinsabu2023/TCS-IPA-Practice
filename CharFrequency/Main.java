
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Character, Integer> mp = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (Character ch : str.toCharArray()) {
            if (mp.containsKey(ch)) {
                mp.put(ch, mp.get(ch) + 1);
            } else {
                mp.put(ch, 1);
            }
        }
        sc.close();
        // iterating over the map
        for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}