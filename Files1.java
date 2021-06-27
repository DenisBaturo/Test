package com.company;
import java.io.*;
import java.nio.file.Path;
import java.util.Random;

public class Files1 {

    public static void main(String[] args) throws Exception {

        Random rand = new Random();

        for(int i = 1; i < 11; i ++){

            File my_file = new File("C:\\Users\\Home\\Desktop\\Новая папка\\" + i + ".txt");
            BufferedWriter bw = new BufferedWriter(new FileWriter(my_file));

            bw.write(rand.nextInt(50));
            bw.newLine();
            bw.write(rand.nextInt(50));
            bw.newLine();
            bw.write(rand.nextInt(50));
            bw.newLine();

            bw.close();

        }
    }


}
