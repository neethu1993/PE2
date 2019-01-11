package com.stackroute.pe2;

import com.stackroute.pe2.Palindrome;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PalindromeTest {
    Palindrome object;
    @Before
    public void setUp()
    {
        object = new Palindrome();
    }

    @After
    public void tearDown(){

        object = null;
    }

    @Test
    public void testSuccess() throws Exception{

        String expectedValue = "com.stackroute.pe2.Palindrome";
        //Act
        String actualValue = object.reverse("abcdcba");
        //Assert
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testFailure() throws Exception{
        String expectedValue = "Not com.stackroute.pe2.Palindrome";
        //Act
        String actualValue = object.reverse("abcd");
        //Assert
        assertEquals(expectedValue,actualValue);
    }
}
