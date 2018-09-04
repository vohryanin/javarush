package com.javarush.task.task18.task1823;

import java.util.HashMap;
import java.util.Map;
import java.io.*;
/*
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws Exception{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while (!(s=buf.readLine()).equals("exit")){
            new ReadThread(s).start();
        }
//        System.out.println();
    }

    public static class ReadThread extends Thread {
        String fileName;
        public ReadThread(String fileName) {
            //implement constructor body
            this.fileName=fileName;
        }
        // implement file reading here - реализуйте чтение из файла тут
        public void run(){
            try{
                FileInputStream inp = new FileInputStream(fileName);
                int[] mas = new int[256];
                for (int x: mas){
                    x=0;
                }
                while (inp.available() > 0){
                    int d = inp.read();
                    mas[d]+=1;
                }
                int max=0;
                for (int x: mas){
                    if (x>max) max=x;
                }
                int i=0;
                for (i=0;i!=mas.length;i++){
                    if (mas[i]==max) break;
                }
                resultMap.put(fileName,i);
                inp.close();
            } catch(Exception e){}
        }
    }
}
