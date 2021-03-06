import java.util.HashMap;
import java.util.Map;

public class NumberInWords {

    public String transferNumberToWord(int number) {
        Map<Integer, String> wordsMap = new HashMap<Integer, String>(){{
            put(0, "zero"); put(1, "one"); put(2, "two"); put(3, "three"); put(4, "four");
            put(5, "five"); put(6, "six"); put(7, "seven"); put(8, "eight"); put(9, "nine");
            put(10, "ten"); put(11, "eleven"); put(12, "twelve"); put(13, "thirteen"); put(14, "fourteen");
            put(15, "fifteen"); put(16, "sixteen"); put(17, "seventeen"); put(18, "eighteen"); put(19, "nineteen");
            put(20, "twenty");put(30, "thirty");
        }};
        if (wordsMap.containsKey(number)) {
            return wordsMap.get(number);
        }
        return wordsMap.get(20) + " " + wordsMap.get(number - 20);
    }
}
