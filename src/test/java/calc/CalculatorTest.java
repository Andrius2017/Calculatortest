package calc;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calc=new Calculator();
    @Test
    public void add() throws Exception {
        assertEquals(  4, calc.add(3,1) ,  0.000011);
    }

    @Test
    public void sub() throws Exception {
        assertEquals(  2, calc.sub(3,1),0.000011 );
    }

    @Test
    public void mul() throws Exception {
        assertEquals(  8, calc.mul(4,2),0.000011 );

    }

    @Test
    public void div() throws Exception {
        assertEquals(  2, calc.div(8,4),0.000011 );

    }
//    @Test(expected = ArithmeticException.class)
    @Test
    public void divByZero() throws Exception{
       assertEquals(Double.POSITIVE_INFINITY,calc.div(5,0),0.001);

    }

}