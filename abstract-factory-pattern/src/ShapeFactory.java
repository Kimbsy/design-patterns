public class ShapeFactory extends AbstractFactory {

  @override
  public Shape getShape(String shapeType) {

    if (shapeType == null) {
      return null;
    }

    if (shapeType.equalsIgnoreCase("CIRCLE")) {
      return new Circle();

    } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
      return new Rectangel();

    } else if (shapeType.equalsIgnoreCase("SQUARE")) {
      return new Square();
    }

    return null;
  }

  @override
  Color getColor(String color) {
    return null;
  }
}
