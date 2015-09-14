Factory Pattern (Creational).

Using the Factory pattern we create an object without exposing the creation logic to the client and refer to newly created object using a common interface.

* Create an interface.
  * `Shape.java`
* Create concrete classes implementing the same interface
  * `Rectangle.java`
  * `Square.java`
  * `Circle.java`
* Create a Factory to generate object of concrete class based on given information
  * `ShapeFactory.java`
* Use the Factory to get object of concrete class by passing information (such as type).
  * `FactoryPatternDemo.java`
* Verify the output.
```
Inside Circle::draw() method.
Inside Rectangle::draw() method.
Inside Square::draw() method.
```