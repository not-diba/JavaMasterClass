public class Refrigerator {
  private boolean hasWorkToDo;

  public void orderFood() {
    if (hasWorkToDo) {
      System.out.println("Has orderFood");
    }
  }

  public void start(boolean start) {
    this.hasWorkToDo = start;
  }

  public boolean isWorking() {
    return hasWorkToDo;
  }
}
