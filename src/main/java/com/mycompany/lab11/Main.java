package com.mycompany.lab11;

import java.io.IOException;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        Formatter f = new Formatter();
        f.format("text.txt", "output.txt");
    }
}
