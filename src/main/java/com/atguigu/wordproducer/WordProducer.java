package com.atguigu.wordproducer;

import java.io.FileOutputStream;
import java.io.IOException;

public class WordProducer {

    private static final String[] words = new String[]{"January", "February", "March", "April", "May",
            "June", "August", "September", "October", "November","December"};

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("d:/word.txt");
        for (int i = 0; i < 1300000; i++) {
            fos.write((words[(int) (Math.random() * words.length)] + " ").getBytes());
            if (i % 10 == 0) {
                fos.write('\n');
            }
        }
        fos.close();
    }
}
