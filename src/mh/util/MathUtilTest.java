package mh.util;

import junit.framework.Assert;
import org.junit.Test;

import static junit.framework.Assert.*;

public class MathUtilTest {
    @Test
    public void computeFactorial() {

    }

    @Test
    public void testSuccessfulCases(){
//        assertEquals(1, MathUtil.computeFactorial(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFalseCase() {
        assertEquals(MathUtil.computeFactorial(-2), 1);
    }
}