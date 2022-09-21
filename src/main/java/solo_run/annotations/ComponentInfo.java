package solo_run.annotations;
/*
     //We can use annotations in many places in our code. The elements where this is possible include:
 - class and interface definitions
 - class fields
 - constructors, methods and their arguments
     //The elements on which we can apply a given annotation depends on how it was defined.
      */
public @interface ComponentInfo {
   String name();
   String date();
   int currentRevision();


   // sample use
   //// @ComponentInfo(name = "someName", date = "10-12-2021", currentRevision = 3)
}