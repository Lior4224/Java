/*
Lior Polischouk
APCS
HW#08: Refactor Freshie Zero
9/30/21
*/
public class Greet {
  public static void main (String [] args) {
    greet();
  }
  public static void greet () {
    System.out.println("Hi, Daniel. How are you?");
    System.out.println("Hello, Jeff. I haven't seen you in a while!");
    System.out.println("Greetings, Bob. Nice to meet you.");
  }
}
/*
DISCOVERIES:
-Noticed that doing greet (String [] args) instead of just greet () didn't work, since I had no args to
put into greet() when I called it in main.
UNRESOLVED QUESTIONS:
-none
*/
