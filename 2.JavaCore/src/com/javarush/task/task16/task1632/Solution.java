package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static
    {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());
    }

    public static void main(String[] args) {
    }

    //нить 1
    public static class Thread1 extends Thread {
        @Override
        public void run() {
            while (true) {}
        }
    }

    //    нить2
    public static class Thread2 extends Thread {
        @Override
        public void run() {
            while (true) {
                if (interrupted()) System.out.println("InterruptedException");
            }
        }
    }

    //    нить3
    public static class Thread3 extends Thread {
        @Override
        public void run() {
            while (true) {
                System.out.println("Ура");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

//    нить4
    public static class Thread4 extends Thread implements Message {
    private boolean isCancel = false;
    @Override
    public void showWarning() {
        isCancel = true;
    }

    @Override
    public void run() {
        try {
            while ( !isCancel ) {Thread.sleep(0);}
        } catch (InterruptedException e) {}
    }
}

//нить5
    public static class Thread5 extends Thread {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    @Override
    public void run() {
        String line;
        int sum = 0;

        while ( true ) {
            try {
                line = reader.readLine();
                if (line.equals("N")) break;
                sum += Integer.parseInt(line);
            } catch (IOException e) {
            } catch (NumberFormatException e) {
            }
        }
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(sum);
    }
}
}