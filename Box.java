/**
 * Box class
 * @author Jackie Jiang
 * @version 1.0
 * Date: Mar 10
 */
public class Box{
    private String name;
    private Rectangle rect;
    private static int numOfShapes = 0;
    /**
     * Box constructor
     * @param name
     * @param rect
     */
    public Box(String name, Rectangle rect){
        this.name = name;
        this.rect = rect;
    }
    /**
     * setName method that allows you to change name
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }
    /**
     * getName method that returns the box name
     * @return name
     */
    public String getName(){
        return name;
    }
    /**
     * setRect that allows you to change rect
     * @param rect
     */
    public void setRect(Rectangle rect){
        this.rect = rect;
    }
    /**
     * getRect method that return rect
     * @return
     */
    public Rectangle getRect(){
        return rect;
    }
    /**
     * getNumOfShapes method that returns the numOfShapes
     * @return
     */
    public int getNumOfShapes(){
        return numOfShapes;
    }
    /**
     * callRect method that displays the rects details
     * @return
     */
    public String callRect(){
        return this.rect.toString();
    }
    /**
     * toString method that prints the shape details
     */
    public String toString(){
        return "Box Name: "+this.name+"\nNumber Of Shapes: "+this.getNumOfShapes()+"\nRectangle info: \n"+this.callRect();
    }

}