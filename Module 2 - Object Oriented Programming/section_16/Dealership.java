import java.util.Arrays;

public class Dealership {
  private Car[] cars;

  public Dealership() {
    this.cars = new Car[3];
  }

  public void setCar(Car car, int idx) {
    this.cars[idx] = new Car(car);  // avoid reference trap
  }
}
