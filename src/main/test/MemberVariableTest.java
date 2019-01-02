import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;

public class MemberVariableTest {
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

    public class MemberVariableTest {
        @Before
        public void setUp()
        {
            MemberVariable object = new MemberVariable();
        }

        @After
        public void tearDown(){

            object = null;
        }

        @Test
        public void testSuccess() throws Exception{

            String expectedName = "Harry Potter";
            //Act
            String actualName = object.MemberName("Harry Potter");
            //Assert
            assertEquals(expectedName,actualName);

            int expectedAge = 30;
            //Act
            int actualAge = object.MemberAge(30);
            //Assert
            assertEquals(expectedAge,actualAge);

            String expectedSalary = "2500.3";
            //Act
            String actualSalary = object.MemberSalary("2500.3");
            //Assert
            assertEquals(expectedSalary,actualSalary);

        }

        @Test
        public void testFailure() throws  Exception{
            //Act
            String actualName = object.MemberName(null);
            //Assort
            assertNull(actualName);

            //Act
            int actualAge = object.MemberAge(null);
            //Assort
            assertNull(actualAge);

            //Act
            String actualSalary = object.MemberSalary(null);
            //Assort
            assertNull(actualSalary);
        }
    }
}
