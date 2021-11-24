import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
//    void testaddIntMultiple() {
//        assertEquals(3,Calculator.add(1,2),"test 1");
//        assertEquals(3,Calculator.add(0,2),"test 2");
//        assertEquals(3,Calculator.add(-1,-2),"test 3");
//    }
//    void testaddIntMultiple() {
//        assertAll( "Test all add func",
//                () -> assertEquals(3,Calculator.add(1,2)),
//        () -> assertEquals(3,Calculator.add(0,2)),
//        () ->    assertEquals(3,Calculator.add(-1,-2)));
//    }
//    void testDivide(){
//        assertEquals(3.333,Calculator.divide(10,3),0.001);
//    }
    void testDivideThrow(){
        assertThrows(ArithmeticException.class,
                ()-> Calculator.divide(1,2));
    }
}