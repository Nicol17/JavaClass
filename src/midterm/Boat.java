package midterm;

public class Boat extends Vehicle {

  //Constructor
  public Boat(String productId, int weight) {
    super(productId, weight);
  }

  //Implement Method


  @Override
  public void accelerate() {
    System.out.println("jet water");
  }

  @Override
  public void steerLeft() {
    System.out.println("turn tiller left");
  }

  @Override
  public void steerRight() {
    System.out.println("turn tiller right");
  }

  //Override
  @Override
  public String toString() {
    return "Boat{productID=" + productID + ", weight=" + weight + "}";
  }
}
