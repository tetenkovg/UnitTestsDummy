package testNg.calculator;

import calculator.Calculator;
import org.testng.annotations.Test;


import static org.testng.AssertJUnit.assertEquals;

public class CalculatorTests {

    Calculator calculator = new Calculator();

    @Test
    public void TestsSum(){
        assertEquals("Сложение посчитано не верно",5, calculator.add(2, 3));
        assertEquals("Сложение посчитано не верно",-1, calculator.add(2, -3));
        assertEquals("Сложение посчитано не верно",1, calculator.add(-2, 3));
        assertEquals("Сложение посчитано не верно",-5, calculator.add(-2, -3));
    }

    @Test
    public void TestSubstract(){
        assertEquals("Разница посчитана не верно",5, calculator.subtract(2, -3));
        assertEquals("Разница посчитана не верно",-1, calculator.subtract(2, 3));
        assertEquals("Разница посчитана не верно",-5, calculator.subtract(-2, 3));
        assertEquals("Разница посчитана не верно",1, calculator.subtract(-2, -3));
    }
@Test
    public void TestMultiply(){
        assertEquals("Сложение посчитанао не верно",0, calculator.multiply(3, 0));
        assertEquals("Сложение посчитанао не верно",0, calculator.multiply(0, 3));
        assertEquals("Сложение посчитанао не верно",-3, calculator.multiply(3, -1));
        assertEquals("Сложение посчитанао не верно",-3, calculator.multiply(-1, 3));
        assertEquals("Сложение посчитанао не верно",12, calculator.multiply(4, 3));
    }
    @Test (expectedExceptions = ArithmeticException.class)
    public void TestDivision(){
        assertEquals("Деление посчитанао не верно",1, calculator.divide(3, 3));
        assertEquals("Деление посчитанао не верно",3, calculator.divide(3, 1));
        assertEquals("Деление посчитанао не верно",0, calculator.divide(1, 3));
        assertEquals("Деление посчитанао не верно",-5, calculator.divide(15, -3));
        assertEquals("Деление посчитанао не верно",-5, calculator.divide(-15, 3));
        assertEquals("Деление посчитанао не верно",0, calculator.divide(0, 3));
        assertEquals("Деление посчитанао не верно",0, calculator.divide(3, 0));
    }

}
