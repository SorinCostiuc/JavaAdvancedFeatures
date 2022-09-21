package solo_run.button;

public abstract class AbstractButton implements ComponentClickListener {
    public static final String TAG = "Button";

    String componentName;

    String getComponentName() {
        return componentName;
    }

    abstract void click();
}