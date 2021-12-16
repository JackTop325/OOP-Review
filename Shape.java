/**
 * Shape class
 * @author Jackie Jiang
 * @version 1.0
 * Date: Mar 10
 */
public class Shape{
    public String name;

    /**
     * The default shape constructor
     */
    public Shape(){
        this.name = "Polygon";
    }
    /**
     * Shape constructor
     * @param name
     */
    public Shape(String name){
        this.name = name;
    }
    /**
     * Set name method
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * getName method
     * @return name
     */
    public String getName() {
        return name;
    }

    public String toString(){
        return "Shape name: "+this.name;
    }
}