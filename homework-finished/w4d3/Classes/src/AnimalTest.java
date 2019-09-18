import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class AnimalTest {
Animal animal = new Animal("Test", true, 10, 100);

    @Test
    public void testConstructor(){
        Assert.assertNotNull(animal);
    }

    @Test
    public void getName() {
        Assert.assertEquals("Test", animal.getName());
    }

    @Test
    public void getEndangered() {
        Assert.assertEquals(true, animal.getEndangered());
    }

    @Test
    public void getNumLegs() {
        Assert.assertEquals(10, animal.getNumLegs());
    }

    @Test
    public void getTopSpeed() {
        Assert.assertEquals(100, animal.getTopSpeed());
    }

    @Test
    public void setName() {
        animal.setName("Test2");
        Assert.assertEquals( "Test2" ,animal.getName());
    }

    @Test
    public void setEndangered() {
        animal.setEndangered(false);
        Assert.assertEquals( false ,animal.getEndangered());
    }

    @Test
    public void setNumLegs() {
        animal.setNumLegs(2);
        Assert.assertEquals( 2 ,animal.getNumLegs());
    }

    @Test
    public void setTopSpeed() {
        animal.setTopSpeed(60);
        Assert.assertEquals( 60 ,animal.getTopSpeed());
    }

    @Test
    public void testToString() {
        String text ="It is true that the Test is endanagered. They have 10 legs and a top speed of 100 mph.";
        Assert.assertEquals(text, animal.toString());

    }
}