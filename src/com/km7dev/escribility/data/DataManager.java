package com.km7dev.escribility.data;

import java.io.File;
import java.io.FileWriter;

public class DataManager {

    void createFile(File file) {
        try {
            file.createNewFile();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void WriteToTxt(String text) {
        try {
            createFile(new File("file.txt"));
            FileWriter w = new FileWriter("file.txt");
            w.write(text);
            w.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
