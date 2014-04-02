import org.junit.Assert;
import org.junit.Test;

public class TestNumberInWords {
   @Test
    public void _0_return_zero() {
       NumberInWords numberInWords = new NumberInWords();
       String actual = numberInWords.transferNumberToWord(0);
       Assert.assertEquals("zero", actual);
   }

    @Test
     public void _1_return_one() {
        NumberInWords numberInWords = new NumberInWords();
        String actual = numberInWords.transferNumberToWord(1);
        Assert.assertEquals("one", actual);
    }


}
