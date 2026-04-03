public class TeenNumberChecker {
  public static void main(String[] args) {
    System.out.println(hasTeen(9, 99, 19)); // true
    System.out.println(hasTeen(23, 15, 42)); // true
  }

  public static boolean hasTeen(int first, int second, int third) {
    return isTeen(first) || isTeen(second) || isTeen(third);
  }

  public static boolean isTeen(int number) {
    return number >= 13 && number <= 19;
  }
}
