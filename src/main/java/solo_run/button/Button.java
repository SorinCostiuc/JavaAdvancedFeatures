package solo_run.button;

public abstract class Button { // class defined as abstract

    public String getComponentName() { // standard, non-abstract method
        return "Button";
    }

    public abstract void onClick(); // abstract method, does NOT have a body
}