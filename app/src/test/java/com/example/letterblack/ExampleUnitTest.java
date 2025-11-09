package com.example.letterblack;

import org.junit.Test;
import static org.junit.Assert.*;



public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        MainActivity main = new MainActivity();

        assertEquals(5, main.add(2,3));
}
}