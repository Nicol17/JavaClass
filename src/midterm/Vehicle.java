package midterm;

import lab3.Piece;

public abstract class Vehicle implements Steerable {
  protected  String productID;
  protected Integer weight;

  // Default
  public static final Integer DEFAULT_WEIGHT = null;

  // Constructor
  public Vehicle(String productID, int weight) {
    this.productID = productID;
    setWeight (weight);
  }


  // getters, setters
  public String getProductID() {
    return productID;
  }

  public void setProductID(String productID) {
    this.productID = productID;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    if (weight >= 0) {
      this.weight = weight;
    } else {
//      System.out.println("Weight cannot be negative");
      weight = DEFAULT_WEIGHT;
    }
  }

  // Override methods

  @Override
  public String toString() {
    return "Vehicle{productID=" + productID + ", weight=" + weight + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || this.getClass() != o.getClass()) return false;
    Vehicle that = (Vehicle) o;
    if (this.productID == that.productID) {
      return true;
    } else {
      return false;
    }
  }
}
