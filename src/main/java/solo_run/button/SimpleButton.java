package solo_run.button;

public class SimpleButton extends Button { // we inherit an abstract class like any other class

  @Override
  public void onClick() {                              // We MUST implement ALL abstract methods
    System.out.println("Simple Button was clicked");
  }
}