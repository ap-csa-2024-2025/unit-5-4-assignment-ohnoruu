/*
 * # unit 5-4-assignment

## DistanceFormula
Write a method that takes 2 coordinates in a 2D plane (x, y coordinates) and computes the distance between these two points, according to the distance formula, which is as follows:

$$D = \sqrt{\left(x_2-x_1\right)^2 + \left(y_2-y_1\right)^2} $$

This method must be named `distance()` and it must have 4 int parameters. The first parameter will be the x-coordinate of the first point,
 the second parameter will be the y-coordinate of the first point,
 the third parameter will be the x-coordinate of the second point,
 and the fourth parameter will be the y-coordinate of the second point. This method must return a double.

Calling `distance(0, 5, 0, 0)` would return `5.0`.

Note: To use the square root, use `Math.sqrt(x)`, where `x` is your input.  To square something, just multiply it by itself.

## Quadratic Formula
Write a method that takes in three doubles - `a`, `b`, and `c` - that represent the coefficients of a parabola
$$ ax^2 + bx + c $$

Assume that `a` is never 0.  Program the quadratic formula.  Make two methods, one that returns one solution, and another that returns the other solution.

In other words, make a method that returns the solution

$$ x = \dfrac{-b+\sqrt{b^2-4ac}}{2a} $$

and another that returns 

$$ x = \dfrac{-b-\sqrt{b^2-4ac}}{2a} $$

Use `Math.sqrt()` for the square root function.
 */
public class Main
{
  public static void main(String[] args)
  {
    System.out.println(distance(1,5,2,7));
    System.out.println(quadraticPos(-2,6,9));
    System.out.println(quadraticNeg(-2,6,9));
  }

  // Implement distance formula method here
  public static double distance(int x1, int y1, int x2, int y2){
    int diff1 = x2-x1;
    int diff2 = y2=y1;
    int square1 = diff1*diff1;
    int square2 = diff2*diff2;
    double distance = Math.sqrt((double)(square1)+(square2));
    return distance;
  }

  // implement one of your quadratic formula methods here
  public static double quadraticPos(double a, double b, double c){
    double discriminant = b*b-4*(a*c);
    double root = Math.sqrt(discriminant);
    double negB = b*(-1);
    double numerator = negB+root;
    double solutionPos = numerator/(2*a);
    return solutionPos;
  }
  // implement the other quadratic formula here
  public static double quadraticNeg(double a, double b, double c){
    double discriminant = b*b-4*(a*c);
    double root = Math.sqrt(discriminant);
    double negB = b*(-1);
    double numerator = negB-root;
    double solutionNeg = numerator/(2*a);
    return solutionNeg;
  }
}
