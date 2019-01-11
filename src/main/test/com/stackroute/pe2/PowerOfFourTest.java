package com.stackroute.pe2;

import com.stackroute.pe2.PowerOfFour;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PowerOfFourTest {
    PowerOfFour object;
    @Before
    public void setUp()
    {
         object = new PowerOfFour();
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
        String expectedValue = "Not a Power of 4";
        //Act
        String actualValue = object.reverse(10);
        //Assert
        assertEquals(expectedValue,actualValue);
    }
}

