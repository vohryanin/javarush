package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        //1. Программа должна считать имя файла с консоли.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();


        //2. Создай для файла поток для чтения.
        BufferedReader fileBufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));


        //3. Программа должна найти в файле и вывести информацию о id, который передается первым параметром.
        int id = Integer.parseInt(args[0]);
        String line;

        while ((line = fileBufferedReader.readLine()) != null) {
            Product product = new Product(line);
            if (product.getId() == id) {
                System.out.println(product.getId() + " " + product.getProductName() + " " + product.getPrice()
                + " " + product.getQuantity());
                break;
            }
        }


        //4. Поток для чтения из файла должен быть закрыт.
        fileBufferedReader.close();
    }
}

