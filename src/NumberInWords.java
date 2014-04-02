public class NumberInWords {

    public String transferNumberToWord(int number) {
        String[] words = new String[]{
                "zero", "one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine", "ten"};
        return words[number];
    }
}
