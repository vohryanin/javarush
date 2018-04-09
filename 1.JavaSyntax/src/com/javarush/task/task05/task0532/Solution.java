package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;

        //напишите тут ваш код
        int n = Integer.parseInt(reader.readLine());
        int a;
        while (n <= 0){
            System.out.println("Число n должно быть > 0, повторите попытку");
            n = Integer.parseInt(reader.readLine());
        }

        for (int i = 1; i <= n; i++){
            a = Integer.parseInt(reader.readLine());
            if (i == 1) maximum = a;
            else maximum = maximum > a ? maximum : a;
        }
        System.out.println(maximum);
    }
}
