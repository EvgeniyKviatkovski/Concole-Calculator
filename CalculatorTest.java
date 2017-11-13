package com.kwatkowskijeniya;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CalculatorTest {

        @Test
        public void whenPlustwoNumbers() {

            Calculator calc = new Calculator();
            calc.plus(7, 7);
            double result = calc.getResult();
            assertThat(result, is(14.0));

        }

    @Test
    public void whenMinustwoNumbers() {

        Calculator calc = new Calculator();
        calc.minus(25, 1);
        double result = calc.getResult();
        assertThat(result, is(24.0));

    }

    @Test

    public void whenMultiplytwoNumbers(){

            Calculator calc = new Calculator();
            calc.multiply(4,8);
            double  result = calc.getResult();
            assertThat(result,is(32.0));
    }

    @Test
    public void whenDevidetwoNumbers(){

        Calculator calc = new Calculator();
        calc.devide(12,2);
        double  result = calc.getResult();
        assertThat(result,is(6.0));
    }

    @Test
    public void whenDegreetwoNumbers(){

        Calculator calc = new Calculator();
        calc.degree(35,2);
        double  result = calc.getResult();
        assertThat(result,is(1225.0));
    }

    }// end class
