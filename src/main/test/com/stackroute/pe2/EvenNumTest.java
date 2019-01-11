package com.stackroute.pe2;

import com.stackroute.pe2.EvenNum;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class EvenNumTest {

    @Test
    public void testSuccess() throws Exception {
        Boolean expectedValue = true;
        //Act
        Boolean actualValue = EvenNum.reverse(16);

        //Assert
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testFailure() throws Exception{
        Boolean expectedValue = false;
        //Act
        Boolean actualValue = EvenNum.reverse(3);
        //Assert
        assertEquals(expectedValue,actualValue);
    }
}

