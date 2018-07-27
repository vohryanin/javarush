package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
//        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String fileName = br.readLine();
            FileInputStream fr = new FileInputStream(fileName);
            BufferedReader reader = new BufferedReader(new InputStreamReader(fr));
            ArrayList<Integer> arrayList = new ArrayList<>();
            String line = "";
        try {
            while (line != null) {
                line = reader.readLine();
                if (line.isEmpty()) {
                } else {
                    arrayList.add(Integer.parseInt(line));
                }
            }
            Collections.sort(arrayList);
            br.close();
            fr.close();
            reader.close();

//        }
//        catch (FileNotFoundException e) {}
//        catch (IOException e) {}
        }
        catch (NullPointerException e){
            Collections.sort(arrayList);
            br.close();
            fr.close();
            reader.close();
        }
//    }
//        finally {
//        }

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2.0 == 0) {
                System.out.println(arrayList.get(i));
            }
        }
    }
}
