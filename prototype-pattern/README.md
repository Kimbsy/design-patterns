Prototype Pattern (Creational).

The Prototype pattern involves implementing a prototype interface in order to clone an object. You'd use this when creation of an object directly is undesirable (i.e. a series of costly database operations). We can cache the object and return it's clone when it's next requested, updating the database as and when needed.

* Create an abstract class implementing the Cloneable interface.
  * `Shape.java`
* Create concrete classes extending the Shape class.
  * `Rectangle.java`
  * `Square.java`
  * `Circle.java`
* Create a class to get concrete classes from database and store them in Hashtable.
  * `ShapeCache.java`
* Use ShapeCache to get clones of shapes stored in Hashtable.
  * `PrototypePatternDemo.java`
* Verify the output.
```
Shape : Circle
Shape : Square
Shape : Rectangle
```
