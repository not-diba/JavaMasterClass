public class OverloadedMethodChallenge {

  public static void main(String[] args) {
    System.out.println(convertToCentimeters(5, 10));
  }

  private static double convertToCentimeters(int inches) {
    return 2.54 * inches;
  }

  private static double convertToCentimeters(int feet, int inches) {
    int totalInches = (feet * 12) + inches;
    return convertToCentimeters(totalInches);
  }
}
