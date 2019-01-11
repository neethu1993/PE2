package com.stackroute.pe2;

import com.stackroute.pe2.StudentAvgGrade;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@RunWith(JUnit4.class)
public class StudentAvgGradeTest {
    StudentAvgGrade obj;
    @Before
    public void setUp() {
        //System.out.println("Inside setup");
       obj = new StudentAvgGrade();
    }
    @Test
    public void StudentAvgTestSuccess()
    {
        int[] arr = new int[]{86,65,98,77};
        int expectedValueMin=65;

        int  actualValueMin=obj.StudentMin(4,arr);

        assertEquals(expectedValueMin,actualValueMin);

        int expectedValueMax=98;

        int  actualValueMax=obj.StudentMax(4,arr);

        assertEquals(expectedValueMax,actualValueMax);

        float expectedValueAvg= (float) 81.50;

        float  actualValueAvg= obj.StudentAvg(4,arr);

//        assertEquals(expectedValueAvg,actualValueAvg);
        assertEquals(expectedValueAvg,actualValueAvg,81.502);

    }

    @Test
    public void StudentAvgTestFailure()
    {
        int[] arr = new int[]{86,101,98,77};
        int expectedValueMin=-1;

        int  actualValueMin=obj.StudentMin(4,arr);

        assertNotEquals(expectedValueMin,actualValueMin);



        int expectedValueMax=-1;

        int  actualValueMax=obj.StudentMax(4,arr);

        assertNotEquals(expectedValueMax,actualValueMax);

        float expectedValueAvg= -1;

        float  actualValueAvg= obj.StudentAvg(4,arr);

        assertNotEquals(expectedValueAvg,actualValueAvg,-1);

    }

    @After
    public void tearDown(){
        //System.out.println("Inside teardown");
        obj=null;
    }

}