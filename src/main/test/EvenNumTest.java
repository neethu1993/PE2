import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class EvenNumTest {
    @Before
    public void setUp()
    {
        EvenNum object = new EvenNum();
    }

    @After
    public void tearDown()
    {
        object = null;
    }

    @Test
    public void testSuccess() throws Exception {
        Boolean expectedValue = true;
        //Act
        Boolean actualValue = object.reverse(16);
        //Assert
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testFailure() throws Exception{
        Boolean expectedValue = true;
        //Act
        String actualValue = object.reverse(13);
        //Assert
        assertNotEquals(expectedValue,actualValue);
    }
}
}
