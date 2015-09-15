public abstract class ColdDrink {

  @override
  public Packing packing() {
    return new Bottle();
  }

  @override
  public abstract float price();
}
