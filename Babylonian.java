
import java.util.Scanner;

public class Babylonian
{
  private static double x = 0;
  private static double val = 0;
  
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("What value would you like the square root of?");
    x = keyboard.nextDouble();
    val = x;
    recursion(x);
    keyboard.close();
  }
  
  public static void recursion(double num)
  {
    x = 0.5 * (x + (val/x));
    if (x * x == val)
    System.out.println("Square root: " + x);
    else
      recursion(x);
  }
}
