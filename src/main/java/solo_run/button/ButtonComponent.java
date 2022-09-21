package solo_run.button;

public class ButtonComponent extends AbstractButton {
  @Override 
  public void click() { // required implementation -> abstract method abstract
    System.out.println("I just clicked a button! Amazing");
  }

  @Override
  public void onClick() { // required implementation -> abstract method of Component Click Listener interface
    System.out.println("I am an onClick handler");
  }
}