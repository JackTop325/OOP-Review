/**
 * Main class
 * @author Jackie Jiang
 * @version 1.0
 * Date: Mar 10
 */
class Main {
  /**
   * main method
   * @param args
   */
  public static void main(String[] args) {
    //create objects
    Rectangle r = new Rectangle(3,5);
    Rectangle r2 = new Rectangle(r);
    Square s = new Square(5);
    Box b = new Box("Box", r);

    //call object method
    System.out.println(b.toString());
    System.out.println(s.toString());
  }
}