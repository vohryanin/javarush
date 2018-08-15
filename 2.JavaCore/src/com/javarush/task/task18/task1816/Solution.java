package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        FileInputStream istream = new FileInputStream(args[0]);
        byte[] bytes = new byte[istream.available()];
        while (istream.available() > 0)
        {
            istream.read(bytes);
        }
        istream.close();
        int k = 0;
        for(int i=0; i<bytes.length; i++)
        {
            if(((bytes[i]>='A'&&bytes[i]<='Z')||(bytes[i]>='a'&&bytes[i]<='z')))
            {
                k++;
            }
        }
        System.out.println(k);

    }
}
