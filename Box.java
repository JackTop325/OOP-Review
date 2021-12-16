public class Box{
    private String name;
    private Rectangle rect;
    private static int numOfShapes = 0;

    public Box(String name, Rectangle rect){
        this.name = name;
        this.rect = rect;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setRect(Rectangle rect){
        this.rect = rect;
    }

    public Rectangle getRect(){
        return rect;
    }

    public int getNumOfShapes(){
        return numOfShapes;
    }

    public String callRect(){
        return this.rect.toString();
    }

    public String toString(){
        return "Board Name: "+this.name+"\nNumber Of Shapes: "+this.getNumOfShapes()+"\nRectangle info: \n"+this.callRect();
    }

}