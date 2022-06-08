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

  /**
   * Function name: search
   *
   * @param make (String)
   * @param budget (int)
   * @return (int)
   *
   * Inside the function:
   *   1. Loops through every element in the cars field.
   *   2. Skips the run if the element is null.
   *   3. If it finds a car the user wants and can afford:
   *     - println: \nWe found a car in spot <i> \n\n <toString>
   *     - print: If you're interested, type 'yes':
   *     - returns the index
   *   4. If the loop runs and it didn't find a car
   *     - println: \nYour search didn't match any results.\n
   *     - returns 404
   */
  public int search(String make, int budget) {
    for (int i = 0; i < cars.length; i++) {
      Car currentCar = this.cars[i];

      if (currentCar == null) {
        continue;
      } else if (currentCar.getMake().equalsIgnoreCase(make) && currentCar.getPrice() <= budget) {
        System.out.println("\nWe found a car in spot " + i + "\n\n" + currentCar.toString());
        System.out.print("If you're interested, type 'yes': ");
        
        return i;
      }
    }

    System.out.println("\nYour search didn't match any results.\n");
    return 404;
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
