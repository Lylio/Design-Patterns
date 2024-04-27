package com.lylechristine.observer;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ObserverTest {

    @Test
    public void testObserver() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Code that prints the text you want to check
        System.out.print("Observer class");

        // Assert that the printed text is equal to the expected value
        assertEquals("Observer class", outContent.toString());
    }
}
