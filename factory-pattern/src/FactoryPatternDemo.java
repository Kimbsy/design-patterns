public class FactoryPatternDemo {

  public static void main(String[] args) {
    ShapeFactory shapeFactory = new ShapeFactory();

    // get a Circle object and call it's draw method
    Shape shape1 = shapeFactory.getShape("CIRCLE");
    shape1.draw();

    // get a Rectangle object and call it's draw method
    Shape shape2 = shapeFactory.getShape("RECTANGLE");
    shape2.draw();

    // get a Square object and call it's draw method
    Shape shape3 = shapeFactory.getShape("SQUARE");
    shape3.draw();
  }
}
