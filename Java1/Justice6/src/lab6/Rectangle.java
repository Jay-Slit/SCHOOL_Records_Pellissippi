/*
 * Author: Cameron Justice
 * Program Title: Rectangle
 * Program Summary: A class to emulate rectangles as objects.
 */
package lab6;

public class Rectangle {
    //Initialize Variables
    private double width;
    private double height;
    
    //Constructors
    public Rectangle(){
        width = 1;
        height = 1;
    }
    
    public Rectangle(double _width, double _height){
        width = _width;
        height = _height;
    }
    
    //Define Getters
    public double getArea(){
        return width*height;
    }
    
    public double getPerimeter(){
        return ((width*2)+(height*2));
    }
}
