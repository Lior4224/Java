/*
Lior Polischouk
APCS
HW#08: Refactor Freshie Zero
9/30/21
*/
public class Greet {
  public static void main (String [] args) {
    greet(Bob);
    greet(Jeff);
    greet(Daniel);
  }
  public static void greet (String name) {
    System.out.println("Greetings, " + name + "how do you do?");

  }
}
/*
DISCOVERIES:
-Noticed that doing greet (String [] args) instead of just greet () didn't work, since I had no args to
put into greet() when I called it in main.
UNRESOLVED QUESTIONS:
-none
*/
