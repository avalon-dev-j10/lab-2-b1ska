package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о треугольнике.
 * <p>
 * Треуго́льник (в евклидовом пространстве) — геометрическая
 * фигура, образованная тремя отрезками, которые соединяют
 * три точки, не лежащие на одной прямой. Указанные три
 * точки называются вершинами треугольника, а отрезки —
 * сторонами треугольника. Часть плоскости, ограниченная
 * сторонами, называется внутренностью треугольника: нередко
 * треугольник рассматривается вместе со своей внутренностью
 * (например, для определения понятия площади).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B5%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Треугольник</a>
 */
public class Triangle implements Polygon {
private float a;
private float b;
private float c;
private float area;
private float x;
private float y;
private float ugolAB;
private int ugol;
private float perimeter;
private float p;



 public Triangle(float a, float b, float ugolAB){
     this.a = a;
     this.b = b;
     this.ugolAB = ugolAB;
     
 }

    /*
     * TODO: Реализовать класс 'Triangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
 
    public void setP(float p) {
        this.p = p;
    }
    
     public float getP() { 
        p = getPerimeter()/2; 
        return p;
    }  //возвращает полупериметр



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

    public float getC() {
        c = (float)Math.sqrt(a*a+b*b+2*a*b*(float)Math.cos(ugolAB));
        return c;
    } //находим 3ю сторону треугольника

    public void setC(float c) {
        this.c = c;
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
    
    public float getUgolAB() {
        return ugolAB;
    }

    public void setUgolAB(float ugolAB) {
        this.ugolAB = ugolAB;
    }
    
    @Override
     public int getRotation(){
         return ugol;
     }

     @Override
     public float getPerimeter(){
         perimeter = a+b+c;
         return perimeter;
     }
     
      @Override
    public float getArea() {
        area = (float)Math.sqrt(getP()*(getP()-a)*(getP()-b)*(getP()-getC()));
        return area;
    }   //считаем площадь треугольнкиа по формуле Герона
     
}
