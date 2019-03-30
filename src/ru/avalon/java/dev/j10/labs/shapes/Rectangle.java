package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы
 * прямые (равны 90 градусам).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */
public class Rectangle implements Polygon {

    public Rectangle(float a,float b,float x,float y){
        this.a = a;
        this.b = b;
        this.x = x;
        this.y = y;
    }
    
    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getPerimetr() { 
        perimetr = (a+b)*2;
        return perimetr;
    } //вычисляем периметр

    public void setPerimetr(float perimetr) {
        this.perimetr = perimetr;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    private float a;
    private float b;
    private float perimetr;
    private float x;
    private float y;
    private int ugol;
    
        @Override
     public int getRotation(){
         return ugol;
     }

     @Override
     public float getPerimeter(){
               return (a+b)*2;
     } //возвращаем периметр прямоугольника
     
      @Override
    public float getArea() { 
        
        
        return a*b;
    } //возвращает площадь прямоугольника
   
    /*
     * TODO: Реализовать класс 'Rectangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
