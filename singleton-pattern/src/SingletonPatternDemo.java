public class SingletonPatternDemo {
  public static void main(String[] args) {

    // VVV illegal construct VVV
    // SingleObject object = new SingleObject();
    
    // get the only object available
    SingleObject object = SingleObject.getInstance();

    // show the message
    object.showMessage();
  }
}
