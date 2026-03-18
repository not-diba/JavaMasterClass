public class DishWasher {
  private boolean hasWorkToDo;

  public void doDishes() {
    if (hasWorkToDo) {
      System.out.println("Do dishes");
    }
  }

  public void start(boolean start) {
    this.hasWorkToDo = start;
  }

  public boolean isWorking() {
    return hasWorkToDo;
  }
}
