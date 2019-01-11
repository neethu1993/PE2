package com.stackroute.pe2;

import com.stackroute.pe2.MemberVariable;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;

public class MemberVariableTest {
    MemberVariable object;
    @Before
        public void setUp()
        {
             object = new MemberVariable();
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
            int actualAge = object.MemberAge(0);
            //Assort
            assertEquals(0,actualAge);

            //Act
            String actualSalary = object.MemberSalary(null);
            //Assort
            assertNull(actualSalary);
        }
}

