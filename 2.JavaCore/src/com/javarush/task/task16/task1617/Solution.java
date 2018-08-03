package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int countSeconds = 4;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //add your code here - добавь код тут
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            //add your code here - добавь код тут
            int count = 0;
            while (!this.isInterrupted()) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
                System.out.printf(countSeconds + " ");
                countSeconds--;
                count++;
                if (countSeconds == 0 && count == 3) {
                    System.out.printf("Марш!");
                    this.interrupt();
                } else if (countSeconds == 0 && count == 4) {
                    { System.out.println("Прервано!"); }
                    this.interrupt();
                }

            }
        }
    }
}
