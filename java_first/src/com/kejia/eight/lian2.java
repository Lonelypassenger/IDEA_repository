package com.kejia.eight;
import java.util.*;
public class lian2 {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();
    public static void main(String args[]){
        Shape[] s = new Shape[9];
        for(int i = 0;i<s.length;i++)
            s[i] = gen.next();
        for(Shape shp : s)
            shp.draw();

    }
}

class Shape{
    public void print_info(){}
    public void draw(){}
    public void erase(){}
}

class Circle extends Shape{
    @Override
    public void draw(){System.out.println("this is Circle.draw()");}
    @Override
    public void erase(){System.out.println("this is Circle.erase()");}
    @Override
    public void print_info(){System.out.println("this is Circle.print_info()");}
}

class Square extends Shape{
    @Override
    public void draw(){System.out.println("this is Square.draw()");}
    @Override
    public void erase(){System.out.println("this is Square.erase()");}
    @Override
    public void print_info(){System.out.println("this is Square.print_info()");}
}

class Triangle extends Shape{
    @Override
    public void draw(){System.out.println("this is Triangle.draw()");}
    @Override
    public void erase(){System.out.println("this is Triangle.erase()");}
    @Override
    public void print_info(){System.out.println("this is Triangle.print_info()");}
}


class RandomShapeGenerator{
    private Random rand  =new Random(47);
    public Shape next(){
        switch (rand.nextInt(3)){
            default:
            case 0:return new Circle();
            case  1:return new Square();
            case 2:return new Triangle();
        }
    }
}