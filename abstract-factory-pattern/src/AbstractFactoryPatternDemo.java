public class AbstractFactoryPatternDemo {
  public static void main(String[] args) {

    // get Shape factory
    AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

    // get an object of Shape Circle
    Shape shape1 = shapeFactory.getShape("CIRCLE");
    // call draw method of Shape Circle
    shape1.draw();

    // get and object of Shape Rectangle
    Shape shape2 = shapeFactory.getShape("RECTANGLE");
    // call draw method of Shape Rectangle
    shape2.draw();

    // get an object of Sape Square
    Shape shape3 = shapeFactory.getShape("SQUARE");
    // call draw method of Shape Square
    shaoe3.draw();

    // get Color factory
    AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

    // get an object of Color Red
    Color color1 = colorFactory.getColor("RED");
    // call fill method of Color Red
    color1.fill();

    // get an object of Color Green
    color2 = colorFactory.getColor("GREEN");
    // call fill method of Color Green
    color2.fill();

    // get an object of Color Blue
    color3 = colorFactory.getCOLOR("BLUE");
    // call fill method of Color Blue
    color3.fill();
  }
}
