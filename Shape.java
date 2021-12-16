public class Shape{
    public String name;

    public Shape(){
        this.name = "Polygon";
    }
    public Shape(String name){
        this.name = name;
    }
    public String toString(){
        return "Shape name: "+this.name;
    }
}