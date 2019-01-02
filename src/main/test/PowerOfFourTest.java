import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class PowerOfFourTest {
    @Before
    public void setUp()
    {
        PowerOfFour object = new PowerOfFour();
    }

    @After
    public void tearDown(){

        object = null;
    }

    @Test
    public void testSuccess() throws Exception {
        String expectedValue = "Power of 4";
        //Act
        String actualValue = object.reverse(16);
        //Assert
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testFailure() throws Exception{
        String expectedValue = "Power of 4";
        //Act
        String actualValue = object.reverse(10);
        //Assert
        assertNotEquals(expectedValue,actualValue);
    }
    }
}
