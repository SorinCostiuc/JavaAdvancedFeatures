package solo_run.button;

import solo_run.button.ButtonComponent;
import solo_run.button.SimpleButton;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
//        Button button = new Button(); // ERROR
        SimpleButton button = new SimpleButton();
        button.onClick();

        ButtonComponent component = new ButtonComponent();
        component.onClick();
        component.click();
    }
}
