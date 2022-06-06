public class Airline {
  private Person[] seats;

  public Airline() {
    this.seats = new Person[11];
  }

  public Person getPerson(int idx) {
    return new Person(this.seats[idx]);
  }

  public void setPerson(Person person) {
    this.seats[person.getSeatNumber() - 1] = new Person(person);
  }
}
