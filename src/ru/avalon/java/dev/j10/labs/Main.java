package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.shapes.*;
import java.util.Random;

public class Main {

 public static void sort(Shape[] shapes) {
        
    for (int i = shapes.length-1; i>0; i--) 
         for (int j = 0; j < i; j++) 
         if (shapes[j].getArea() > shapes[j+1].getArea()){ 
            Shape tmp = shapes[j];
            shapes[j] = shapes[j+1];
            shapes[j+1] = tmp;
          
    }
    
}  //сортировка массива методом Пузырька
 
public static void printArray(Shape[] shapes){
        for(int i =0; i<shapes.length;i++){
         System.out.println("Площадь "+shapes[i].getClass().getSimpleName()+" равна " + shapes[i].getArea()+" ");
         }
                } //вывод отсортированного массива
    
    
    public static void main(String[] args) {
        
       
       Shape[] shapes = new Shape[10];
       
        for (int i=0; i<shapes.length; i++){
            
            Random selecter = new Random();
       
            switch(selecter.nextInt(3)){
                case 0:
                {
                    shapes[i] = new Triangle(selecter.nextFloat()*100,selecter.nextFloat()*100,selecter.nextFloat()*100);
                 }
                break;
                case 1:
                {
                    shapes[i] = new Rectangle(selecter.nextFloat()*100,selecter.nextFloat()*100,0F,0F);
                }
                break;
                case 2:
                {
                    shapes[i] = new Circle(0F,0F,selecter.nextFloat()*100);
                }
                break;
            }
            
        }    
          sort(shapes);  
          printArray(shapes);
          
          System.out.println("Максимальная плоащадь фигуры " +shapes[9].getClass().getSimpleName()+" равна " + shapes[9].getArea());
         
            
            
        
                  
    
        /*
         * TODO: Выполнить действия над массивом 'shapes'
         *
         * 1. Проинициализировать переменную 'shapes' массивом
         *    содержащим 10 произвольных фигур. Массив должен
         *    содержать экземпляры классов Circle, Rectangle
         *    и Triangle.
         *
         * 2. Найти в массиве 'shapes' фигуру с максимальной
         *    площадью. Для поиска фигуры необходимо создать
         *    статический метод в текущем классе (Main).
         */
   
}
}
