Abstract Factory (Creational).

Abstract Factory patterns work around a super-factory which creates other factories.

An interface is responsible for creating a factory of related objects without explicitly specifying their classes. Each generated factory can give the objects as per the Factory pattern.

* Create an interface for Shapes.
  * `Shapes.java`
* Create concrete classes implementing the same interface.
  * `Rectangle.java`
  * `Square.java`
  * `Circle.java`
* Create an interface for colors.
  * `Color.java`
* Create concrete classes implementing the same interface.
  * `Red.java`
  * `Green.java`
  * `Blue.java`
* Create an abstract class to get factories for Color and Shape.
  * `AbstractFactory.java`
* Create Factory classes extending AbstractFactory to generate object of concrete class based on givwen information.
  * `ShapeFactory.java`
  * `ColorFactory.java`
* Create a factory generator/producer class to get factories by passing in information such as Shape or Color.
  * `FactoryProducer.java`
* Use the FactoryProducer to get AbstractFactory in order to get factories of concrete classes  by passing type information.
  * `AbstractFactoryPatternDemo.java`
* Verify the output.
```
Inside Circle::draw() method.
Inside Rectangle::draw() method.
Inside Square::draw() method.
Inside Red::fill() method.
Inside Green::fill() method.
Inside Blue::fill() method.
```