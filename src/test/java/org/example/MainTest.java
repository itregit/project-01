package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void testPrintHello() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;

        System.setOut(new PrintStream(outContent));
        try {
            Main.printHello();
        } finally {
            System.setOut(originalOut);
        }

        assertEquals("Hello World from Java!\n", outContent.toString());
    }
}