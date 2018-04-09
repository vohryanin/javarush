package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String string = reader.readLine();
        String s_a = reader.readLine();
        int i_a = Integer.parseInt(s_a);

        while (i_a > 0) {
            System.out.println(string);
            i_a--;
        }

    }
}
