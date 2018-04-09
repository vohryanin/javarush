package com.javarush.task.task04.task0433;


/* 
Гадание на долларовый счет
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int i = 10;
        int j = 9;
        while (i > 0) {
            j = 9;
            while (j > 0) {
                System.out.print("S");
                j --;
            }
            System.out.println("S");
            i --;
        }

    }
}
