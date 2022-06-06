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
}
