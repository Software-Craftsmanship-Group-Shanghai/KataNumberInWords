import org.junit.Assert;
import org.junit.Test;

public class TestNumberInWords {

    private NumberInWords numberInWords = new NumberInWords();

    @Test
    public void numberInOneWord() {
        assertTransferCorrectly("zero", 0);
        assertTransferCorrectly("one", 1);
        assertTransferCorrectly("two", 2);
        assertTransferCorrectly("ten", 10);
    }

    @Test
    public void numberInTwoWord(){
        assertTransferCorrectly("twenty one", 21);
    }

    private void assertTransferCorrectly(String expected, int number) {
        String actual = numberInWords.transferNumberToWord(number);
        Assert.assertEquals(expected, actual);
    }

}
