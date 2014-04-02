import org.junit.Assert;
import org.junit.Test;

public class TestNumberInWords {
   @Test
    public void _0_return_zero() {
       NumberInWords numberInWords = new NumberInWords();
       String actual = numberInWords.words(0);
       Assert.assertEquals("zero", actual);
   }
}
