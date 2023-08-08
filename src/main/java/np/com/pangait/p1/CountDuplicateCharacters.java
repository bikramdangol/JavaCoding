package np.com.pangait.p1;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicateCharacters {
    public static void main(String[] args) {
        CountDuplicateCharacters countDuplicateCharacters = new CountDuplicateCharacters();
        String str = "characters";
        System.out.println("Duplicate count: " + countDuplicateCharacters.countDuplicateCharacters(str));

    }

    public Map<Character, Integer> countDuplicateCharacters(String str) {
        Map<Character, Integer> result = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }
        return result;
    }
}
