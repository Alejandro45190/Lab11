package com.mycompany.lab11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FormatterTest {
    
    @Test
    public void testInitIndexFile() throws IOException {
        Formatter f = new Formatter();
        File fI = new File("temp.txt");
        List<String> list = new ArrayList<>();
        FileWriter w = new FileWriter(fI);
        w.write("Hello          world          testing   \n");
        w.write("This    is        a  text                file \n");
        w.write("          This is    still               testing \n");
        w.close();
        f.format("temp.txt", "tempOutput.txt");
        File tempOut = new File("tempOutput.txt");
        Scanner sc = new Scanner(tempOut);
        while (sc.hasNextLine()) {
            String text = sc.nextLine();
            list.add(text);
        }
        sc.close();
        assertEquals("Hello world testing", list.get(0));
        assertEquals("This is a text file", list.get(1));
        assertEquals("This is still testing", list.get(2));
        fI.deleteOnExit();
        tempOut.deleteOnExit();
    }
    
}
