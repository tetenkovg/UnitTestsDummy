package junit.evenoddchecker;

import evenoddchecker.EvenOddChecker;
import org.junit.Assert;
import org.junit.Test;


public class EvenOddCheckerTests {
    @Test
    public void testEvenNumber(){
        Assert.assertEquals("2 должно быть четным", true, EvenOddChecker.check(2));
        Assert.assertEquals("-2 должно быть четным", true, EvenOddChecker.check(-2));
        Assert.assertEquals("0 должно быть четным", true, EvenOddChecker.check(0));
    }
    @Test
    public void testOddNumber(){
        Assert.assertEquals("3 должно быть нечетным", false, EvenOddChecker.check(3));
        Assert.assertEquals("-3 должно быть нечетным", false, EvenOddChecker.check(-3));
    }
}
