import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

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

