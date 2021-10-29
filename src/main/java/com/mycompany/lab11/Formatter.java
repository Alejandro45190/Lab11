package com.mycompany.lab11;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Formatter {
    
    public void format(String inFile, String outFile) throws IOException {
        
        FileReader fileIn = new FileReader(inFile);
        Scanner sc = new Scanner(fileIn);
        ArrayList<String> list = new ArrayList<>();
        //reading from list
        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line.trim());
            String oneSpace = line.trim().replaceAll(" +", " ");
            list.add(oneSpace);
        }
        sc.close();
        //writing from text file
        File fileOut = new File(outFile);
        FileWriter fWriter = new FileWriter(fileOut);
        fWriter.write(list.toString());
        fWriter.close();
    }
}
