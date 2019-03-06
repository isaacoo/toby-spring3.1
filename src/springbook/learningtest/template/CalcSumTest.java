package springbook.learningtest.template;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.IOException;

public class CalcSumTest {
    Calculater calculater;
    String numFilepath;

    @Before
    public void setUp() {
        this.calculater = new Calculater();
        this.numFilepath = getClass().getResource("numbers.txt").getPath();
    }

    @Test
    public void sumOfNumbers() throws IOException {
        assertThat(calculater.calcSum(this.numFilepath), is(10));
    }

    @Test
    public void multiplyOfNumbers() throws IOException {
        assertThat(calculater.calcMultiply(this.numFilepath), is(24));
    }

    @Test
    public void concatenateStrings() throws IOException {
        assertThat(calculater.concatenate(this.numFilepath), is("1234"));
    }
}
