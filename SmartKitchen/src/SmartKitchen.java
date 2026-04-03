public class SmartKitchen {
  public boolean refrigeratorStart;
  public boolean dishWasherStart;
  public boolean coffeeMakerStart;

  public SmartKitchen(boolean refrigeratorStart, boolean dishWasherStart, boolean coffeeMakerStart) {
    this.coffeeMakerStart = coffeeMakerStart;
    this.dishWasherStart = dishWasherStart;
    this.refrigeratorStart = refrigeratorStart;
  };

  CoffeeMaker coffeeMaker = new CoffeeMaker();
  DishWasher dishWasher = new DishWasher();
  Refrigerator iceBox = new Refrigerator();

  private void setKitchenState(boolean refrigeratorStart, boolean dishWasherStart, boolean coffeeMakerStart) {
    coffeeMaker.start(coffeeMakerStart);
    iceBox.start(refrigeratorStart);
    dishWasher.start(dishWasherStart);
  }

  public void doKitchenWork() {
    setKitchenState(this.refrigeratorStart, this.dishWasherStart, this.coffeeMakerStart);
    coffeeMaker.brewCoffee();
    iceBox.orderFood();
    dishWasher.doDishes();
  }
}
