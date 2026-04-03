public class EqualSumChecker {
  public static void main(String[] args) {
    System.out.println(hasEqualSum(1, -1, 0)); // true
    System.out.println(hasEqualSum(1, 1, 1)); // false
  }

  public static boolean hasEqualSum(int first, int second, int third) {
    return (first + second) == third;
  }
}
