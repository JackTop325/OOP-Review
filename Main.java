class Main {
  public static void main(String[] args) {
    Rectangle r = new Rectangle(3,5);
    Rectangle r2 = new Rectangle(r);
    Board b = new Board("Board", 5, r);
    System.out.println(b.toString());
  }
}