package com.mycompany.lab11;

import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FormatterTest {
    
    @Test
    public void testFormat() throws IOException {
        assertEquals("The files differ!",
        FileUtils.readFileToString(file1, "utf-8"),
        FileUtils.readFileToString(file2, "utf-8"));
    }
    
}
