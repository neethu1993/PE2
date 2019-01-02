import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PalindromeTest {
    @Before
    public void setUp()
    {
        Palindrome object = new Palindrome();
    }

    @After
    public void tearDown(){

        object = null;
    }

    @Test
    public void testSuccess() throws Exception{

        String expectedValue = "Palindrome";
        //Act
        String actualValue = object.reverse("abcdcba");
        //Assert
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testFailure() throws Exception{
        String expectedValue = "Palindrome";
        //Act
        String actualValue = object.reverse("abcd");
        //Assert
        assertNotEquals(expectedValue,actualValue);
    }
}
