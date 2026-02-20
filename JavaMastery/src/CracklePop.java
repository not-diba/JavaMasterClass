public class CracklePop {
  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      System.out.println(cracklePop(i));
    }
  }

  public static String cracklePop(int number) {
    if (number % 3 == 0 && number % 5 == 0) {
      return "CracklePop";
    } else if (number % 3 == 0) {
      return "Crackle";
    } else if (number % 5 == 0) {
      return "Pop";
    } else {
      return Integer.toString(number);
    }
  }
}
