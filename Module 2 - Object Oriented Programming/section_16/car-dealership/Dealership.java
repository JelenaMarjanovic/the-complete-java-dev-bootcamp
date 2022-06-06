public class Dealership {
  private Car[] cars;

  public Dealership(Car[] cars) {
    this.cars = new Car[cars.length];

    for (int i = 0; i < cars.length; i++) {
      this.cars[i] = new Car(cars[i]);
    }
  }

  public Car getCar(int idx) {
    return new Car(this.cars[idx]); // avoid reference trap
  }

  public void setCar(Car car, int idx) {
    this.cars[idx] = new Car(car);  // avoid reference trap
  }

  public void sell(int idx) {
    this.cars[idx].drive();
    this.cars[idx] = null;
  }

  public String search(String make, int budget) {
    for (int i = 0; i < cars.length; i++) {
      Car currentCar = this.cars[i];

      if (currentCar == null) {
        continue;
      } else if (currentCar.getMake().equals(make) && currentCar.getPrice() <= budget) {
        return "\nWe found one in spot " + i + "\n" + currentCar.toString()
          + "\nAre you interested?\n";
      }
    }

    return "\nSorry, we couldn't find any cars.\n";
  }

  public String toString() {
    String result = "";

    for (int i = 0; i < this.cars.length; i++) {
      Car currentCar = this.cars[i];

      result += "Parking Spot: " + i + "\n";

      if (currentCar == null) {
        result += "Empty\n";
      } else {
        result += currentCar.toString() + "\n";
      }
    }
    
    return result;
  }
}
