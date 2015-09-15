public class Square extends Shape {

  public Square() {
    type = "Square";
  }

  @override
  public void draw() {
    System.out.println("Inside Square::draw() method.")
  }
}
