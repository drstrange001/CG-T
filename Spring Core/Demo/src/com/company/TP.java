package com.company;

import java.io.*;

public class TP {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Temp\\input.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        StringBuilder sbr = new StringBuilder();
        String str = "";
        while ((str = br.readLine()) != null) {
            sbr.append(str);
        }
        br.close();
        boolean prev = false;
        int count = 0;
        for (int i = 0; i < sbr.length(); i++) {
            if (sbr.charAt(i) == ' ') {
                prev = true;
            } else if (prev) {
                count++;
                prev = false;
            }
        }
        FileWriter flw = new FileWriter("C:\\Temp\\output.txt");
        BufferedWriter writer = new BufferedWriter(flw);
        writer.write(String.valueOf(count));
        writer.close();
    }
}