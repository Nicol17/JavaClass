package midterm;

public class Car extends Vehicle {
  private boolean isLeftHandDriving;

  //Constructor
  public Car(String productID, Integer weight, boolean isLeftHandDriving) {
    super(productID, weight);
    this.isLeftHandDriving = isLeftHandDriving;
  }

  //Getters, setters

  public boolean isLeftHandDriving() {
    return isLeftHandDriving;
  }

  public void setLeftHandDriving(boolean leftHandDriving) {
    isLeftHandDriving = leftHandDriving;
  }

  //Implement methods

  @Override
  public void accelerate() {
    if (weight == DEFAULT_WEIGHT) {
      System.out.println("there's something wrong");
    } else {
      System.out.println("fire pistons, turn wheels");
    }
  }

  @Override
  public void steerLeft() {
    System.out.println("turn wheels left");
  }

  @Override
  public void steerRight() {
    System.out.println("turn wheels right");
  }

  // Override
  @Override
  public String toString() {
    return "Car{productID=" + productID + ", weight=" + weight + ", isLeftHandDriving=" + isLeftHandDriving + "}";
  }
}
