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

  public void createReservation(Person person) {
    while (this.seats[person.getSeatNumber() - 1] != null) {
      System.out.println("\n" + person.getName() + ", seat: " + person.getSeatNumber()
        + " is already taken. Please choose another seat.\n");
    }

    int idx = person.getSeatNumber() - 1;
    this.seats[idx] = new Person(person);
    System.out.println("Thank you " + person.getName() + " for flying with Java airlines. "
      + "Your seat number is " + person.getSeatNumber() + ".\n");
  }

  public String toString() {
    String temp = "";

    for (int i = 0; i < this.seats.length; i++) {
      Person currentPerson = this.seats[i];

      if (currentPerson != null) {
        temp += currentPerson.toString();
      } else {
        temp += "Seat " + (i + 1) + " is empty.";
      }

      temp += "\n\n";

    }

    return temp;
  }
}
