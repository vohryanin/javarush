package com.javarush.task.task18.task1812;

import java.io.*;

/* 
Расширяем AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream {
    private AmigoOutputStream aus;

    public QuestionFileOutputStream(AmigoOutputStream amigoOutputStream) {
        this.aus = amigoOutputStream;
    }

    @Override
    public void flush() throws IOException {
        aus.flush();
    }

    @Override
    public void write(int b) throws IOException {
        aus.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        aus.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        aus.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        System.out.printf("Вы действительно хотите закрыть поток? Д/Н");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        if (reader.readLine().toCharArray()[0] == 'Д') aus.close();
    }
}

