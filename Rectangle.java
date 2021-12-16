class Rectangle extends Shape{
    public double length;
    public double width;

    public Rectangle(){
        super("Rectangle");
        this.length = 0;
        this.width = 0;
    }
    public Rectangle(double length,double width){
        super("Rectangle");
        this.length = length;
        this.width = width;
    }
    public Rectangle(Rectangle rect){
        super("Rectangle");
        this.length = rect.length;
        this.width = rect.width;
    }
    private double area(double length,double width){
        return length*width;
    }
    private double perimeter(double length,double width){
        return 2*(length+width);
    }

    public String toString(){
        return "Shape name: "+this.name+"\nArea: "+this.area(this.length, this.width)+"\nPerimeter: "+this.perimeter(this.length, this.width);
    }
}