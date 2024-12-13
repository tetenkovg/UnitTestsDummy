package junit.rectangle;

import org.junit.Assert;
import org.junit.Test;
import rectangle.Rectangle;

import static org.junit.Assert.assertEquals;

public class RectangleTests {

    Rectangle rectangle = new Rectangle( 5, 6);

    @Test
    public void testGetArea(){
       assertEquals("Error", 30, rectangle.getArea(), 0.001);
    }

    @Test
    public void testSetLength(){
        rectangle.setLength(50.01);
        assertEquals("Error", 50.01, rectangle.getLength(), 0.1);
    }
    @Test
    public void testSetWidth(){
        rectangle.setWidth(55.01);
        assertEquals("Error", 55.01, rectangle.getWidth(), 0.1);
    }

}
