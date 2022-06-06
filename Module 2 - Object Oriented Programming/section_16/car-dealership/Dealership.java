public class Dealership {
  private Car[] cars;

  public Dealership() {
    this.cars = new Car[3];
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
}
