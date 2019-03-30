package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление об окружности.
 * <p>
 * Окру́жность — замкнутая плоская кривая, которая состоит из
 * всех точек на плоскости, равноудалённых от заданной точки.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9E%D0%BA%D1%80%D1%83%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C">Окружность</a>
 */
public class Circle implements Ellipse  {
    
    public Circle(float x, float y, float radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
        
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
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
    
  
    @Override
    public float getLength(){
        float length = 2*radius*pi;
        return length;
    }
    
    @Override
      public float getArea() {
        area = pi*radius*radius;  
        return area;
    }

    @Override
    public int getRotation(){
        return ugol;
    }
    
    
 private float area;
 float radius;
 float x;
 float y;
 int ugol;

  
    /*
     * TODO: Реализовать класс 'Circle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
