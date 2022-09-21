package solo_run.annotations;

import java.time.Month;
/*
 While defining an annotation and its elements ("methods"), we must bear in mind some limitations:
  - elements can only return certain types, including:
      + simple types (e.g. int, float, double) and their object-oriented counterparts (e.g. Integer, Double)
      + String class
      + enums
      + other annotations
      + arrays of the types as mentioned above
  -these elements cannot take any arguments (i.e. look like method declarations with no arguments)
  */
public @interface PersonInfo {
   String[] names();
   String[] dates();
   Month month(); // java.time.Month is an enumerated type


}

// sample use
      //@PersonInfo(names = {"Alice", "Andrew"}, dates = {}, month = Month.APRIL)