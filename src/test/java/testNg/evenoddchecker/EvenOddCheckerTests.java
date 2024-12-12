package testNg.evenoddchecker;

import evenoddchecker.EvenOddChecker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EvenOddCheckerTests {
    @Test
    public void testEvenNumber(){
        Assert.assertEquals(true, EvenOddChecker.check(2),"2 должно быть четным");
        Assert.assertEquals(true, EvenOddChecker.check(-2),"-2 должно быть четным");
        Assert.assertEquals(true, EvenOddChecker.check(0),"0 должно быть четным");
        Assert.assertEquals(false, EvenOddChecker.check(3),"3 должно быть нечетным");
        Assert.assertEquals(false, EvenOddChecker.check(-3),"-3 должно быть нечетным");
    }
    @Test
    public void testOddNumber(){
        Assert.assertEquals(false, EvenOddChecker.check(3),"3 должно быть нечетным");
        Assert.assertEquals(false, EvenOddChecker.check(-3),"-3 должно быть нечетным");
    }
}
