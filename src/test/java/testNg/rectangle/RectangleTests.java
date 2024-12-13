package testNg.rectangle;


import static org.testng.Assert.assertEquals;

import org.testng.annotations.*;
import rectangle.Rectangle;

public class RectangleTests {

    Rectangle rectangle = new Rectangle(5, 6);


    @Test
    public void testArea(){
        assertEquals(rectangle.getArea(), 30, "Ой ошибка");
    }


    @Test
    public void testSetLengt(){
        rectangle.setLength(6);
        assertEquals(rectangle.getLength(), 6, "Ой ошибка");
    }
    @Test
    public void testSetWidth(){
        rectangle.setWidth(10);
        assertEquals(rectangle.getWidth(), 10, "Ой ошибка");
    }
}
