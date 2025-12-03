public class SecondsAndMinutesChallenge {

  public static void main(String[] args) {
    System.out.println(getDurationString(60, 60));
    System.out.println(getDurationString(3600));
  }

  private static String getDurationString(int seconds) {
    if (seconds < 0) {
      return "Invalid value for minutes: " + seconds + " must be a positive number";
    }

    int minutes = seconds / 60;
    int remainingSeconds = seconds % 60;
    return getDurationString(minutes, remainingSeconds);
  }

  private static String getDurationString(int minutes, int seconds) {
    if (minutes < 0) {
      return "Invalid value for minutes: " + minutes + " must be a positive number";
    }

    if (seconds < 0 || seconds > 59) {
      return "Invalid value for seconds: " + seconds + " must be between 0 and 59";
    }

    int hours = minutes / 60;
    int remainingMinutes = minutes % 60;

    return hours + "h " + remainingMinutes + "m " + seconds + "s";
  }
}
