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
    Rectangle r = new Rectangle(3,5);
    Rectangle r2 = new Rectangle(r);
    Box b = new Box("Box", 5, r);
    System.out.println(b.toString());
  }
}