/*
Lior Polischouk
APCS
HW#09: What Are BigSibs Good For?
10/1/21
*/
public class Greet {
  public static void main (String [] args) {
    BigSib.greet("Bob");
    BigSib.greet("Jeff");
    BigSib.greet("Daniel");
  }
  public static void BigSib.greet (String name) {
    System.out.println("Greetings, " + name + ", how do you do?");

  }
}
