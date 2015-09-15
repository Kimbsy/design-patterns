Builder Pattern (Creational).

The builder pattern builds a complex object using simple objects and using a step by step approach.

* Create an Item interface for representing food item and packing (packaging).
  * `Item.java`
  * `Packing.java`
* Create concrete classes implementing the Packing interface.
  * `Wrapper.java`
  * `Bottle.java`
* Create abstract classes implementing the Item interface.
  * `Burger.java`
  * `ColdDrink.java`
* Create concrete classes extending Burger and ColdDrink classes.
  * `VegBurger.java`
  * `ChickenBurger.java`
  * `Coke.java`
  * `Pepsi.java`
* Create a Meal class having Item objects.
  * `Meal.java`
* Create a MealBuilder class for creating Meal objects.
  * `MealBuilder.java`
* Use MealBuilder to demonstrate builder patetrn.
  * `MealBuilderDemo.java`
* Verify the output.
```
Veg Meal
Item : Veg Burger, Packing : Wrapper, Price : 25.0
Item : Coke, Packing : Bottle, Price : 30.0
Total Cost: 55.0


Non-Veg Meal
Item : Chicken Burger, Packing : Wrapper, Price : 50.5
Item : Pepsi, Packing : Bottle, Price : 35.0
Total Cost: 85.5
```
