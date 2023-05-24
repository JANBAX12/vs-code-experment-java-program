import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.println("What is your name?");
      String name = input.nextLine();
      int count = name.length();
      if (count % 2 == 0) {
        System.out.println("Hello, " + name + "!");
      } else {
        System.out.println("Hi, " + name + "!");
      }
    }
  }
}