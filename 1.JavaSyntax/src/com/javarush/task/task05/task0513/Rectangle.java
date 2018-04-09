package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    //напишите тут ваш код
    int  top, left, width, height;

    //заданы 4 параметра: left, top, width, height
    public void initialize(int top, int left, int width, int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }
    //ширина/высота не задана (оба равны 0)
    public void initialize(int top, int left){
        this.top = top;
        this.left = left;
        this.width = 3;
        this.height = 4;
    }
    //высота не задана (равно ширине) создаём квадрат
    public void initialize(int top, int left, int width){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }
    //создаём копию другого прямоугольника (он и передаётся в параметрах)
    public void initialize(Rectangle rectangle1){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }



    public static void main(String[] args) {

    }
}
