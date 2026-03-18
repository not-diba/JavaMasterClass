public class CoffeeMaker {
  private boolean hasWorkToDo;

  public void brewCoffee() {
    if (hasWorkToDo) {
      System.out.println("Brew coffee");
    }
  }

  public void start(boolean start) {
    this.hasWorkToDo = start;
  }

  public boolean isWorking() {
    return hasWorkToDo;
  }
}
