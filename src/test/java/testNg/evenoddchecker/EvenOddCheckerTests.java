package testNg.evenoddchecker;

import evenoddchecker.EvenOddChecker;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class EvenOddCheckerTests {
    @Test
    public void testEvenNumber(){
        assertEquals(true, EvenOddChecker.check(2),"2 должно быть четным");
        assertEquals(true, EvenOddChecker.check(-2),"-2 должно быть четным");
        assertEquals(true, EvenOddChecker.check(0),"0 должно быть четным");
        assertEquals(false, EvenOddChecker.check(3),"3 должно быть нечетным");
        assertEquals(false, EvenOddChecker.check(-3),"-3 должно быть нечетным");
    }
    @Test
    public void testOddNumber(){
        assertEquals(false, EvenOddChecker.check(3),"3 должно быть нечетным");
        assertEquals(false, EvenOddChecker.check(-3),"-3 должно быть нечетным");
    }
}
