/**
 * Rectangle class that extends Shape class
 * @author Jackie Jiang
 * @version 1.0
 * Date: Mar 10
 */

class Rectangle extends Shape{
    public double length;
    public double width;

    /**
     * Default Rectangle constructor
     */
    public Rectangle(){
        super("Rectangle");
        this.length = 0;
        this.width = 0;
    }
    /**
     * Rectangle constructor
     * @param length
     * @param width
     */
    public Rectangle(double length,double width){
        super("Rectangle");
        this.length = length;
        this.width = width;
    }
    /**
     * Rectangle constructor
     * @param name
     * @param length
     * @param width
     */
    public Rectangle(String name,double length,double width){
        super(name);
        this.length = length;
        this.width = width;
    }
    /**
     * Rectangle constructor
     * @param rect
     */
    public Rectangle(Rectangle rect){
        super("Rectangle");
        this.length = rect.length;
        this.width = rect.width;
    }
    /**
     * Area method that calculates the area
     * @param length
     * @param width
     * @return
     */
    private double area(double length,double width){
        return length*width;
    }
    /**
     * Perimeter method that calculates the perimeter
     * @param length
     * @param width
     * @return
     */
    private double perimeter(double length,double width){
        return 2*(length+width);
    }
    /**
     * toString method that prints the shape details
     */
    public String toString(){
        return "Shape name: "+this.name+"\nArea: "+this.area(this.length, this.width)+"\nPerimeter: "+this.perimeter(this.length, this.width);
    }
}