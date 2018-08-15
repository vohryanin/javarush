package com.javarush.task.task18.task1813;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "C:/temp/result.txt";
    private FileOutputStream fis;

    public AmigoOutputStream(FileOutputStream fileOutputStream) throws FileNotFoundException {
        super(fileName);
        this.fis = fileOutputStream;

    }

    @Override
    public void write(int b) throws IOException {
        fis.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        fis.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        fis.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        String tail = "JavaRush © All rights reserved.";
        flush();
        write(tail.getBytes());
        fis.close();
    }

    @Override
    public void flush() throws IOException {
        fis.flush();
    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}
