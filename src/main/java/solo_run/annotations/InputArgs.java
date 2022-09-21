package solo_run.annotations;
/*
The annotation definitions in the previous examples required us to specify values for all
items when using them. The default keyword allows you to define the default values of
annotation elements, which are used at the end of the defined annotation element, e.g.
 */
public @interface InputArgs {
  int intValue() default 2; // the default value of the intValue field if omitted is 2
  double doubleValue();     // no default value, required field


}
