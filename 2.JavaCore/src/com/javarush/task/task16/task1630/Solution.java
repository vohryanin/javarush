package com.javarush.task.task16.task1630;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileReader;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //add your code here - добавьте код тут
    static
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            secondFileName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();

        //add your code here - добавьте код тут
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут
    public static class ReadFileThread extends Thread implements ReadFileInterface {
        private String fileName;
        private String fileContent = "";

        @Override
        public void setFileName(String fullFileName) {
            fileName = fullFileName;
        }

        @Override
        public String getFileContent() {
            return fileContent;
        }

        @Override
        public void run() {
            try {
                BufferedReader reader = new BufferedReader( new FileReader (fileName));
                String line = null;
                StringBuilder stringBuilder = new StringBuilder();
                String ls = System.getProperty("line.separator");
                while( ( line = reader.readLine() ) != null ) {
                    stringBuilder.append( line );
                    stringBuilder.append( " " );
                }

                stringBuilder.deleteCharAt(stringBuilder.length()-1);
                fileContent = stringBuilder.toString();
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
