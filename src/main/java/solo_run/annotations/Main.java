package solo_run.annotations;

import solo_run.annotations.ComponentInfo;
import solo_run.annotations.InputArgs;
import solo_run.annotations.PersonInfo;

import java.time.Month;

public class Main {
    public static void main(String[] args) {
        //////////////Annotations///////////
        /*
        Annotations implement 3 basic functionalities:
   - providing information for the compiler - the compiler can use the annotation to detect errors or hide warnings
   - information processing to generate code, XML files, etc. during compilation
   - the annotations are available for checking at runtime
         */
//       Ex: @Override


//     ///   they can take arguments:
        /*
        @SuppressWarnings(value = "unchecked")                        // annotation with a single argument
        @LogPotencialErrors(showStackTrace = "true", format = "true") // annotation with two arguments
         */
//     /// if the only argument passed to the annotation is an argument named value, this key may be omitted
        /*
        @SuppressWarnings(value = "unchecked")  // use of value argument
        @SuppressWarnings("unchecked")          // an entry equivalent to that in the line above
        @SomeOtherAnnotation(value = "someValue", otherValue = "someOtherValue") // the case where we can NOT omit the key 'value'
         */
        /////Usage/////// - component info
        ////Limitations////  - person info

    }

    @PersonInfo(names = {}, dates = "12-12-2022", month = Month.AUGUST)
    public static class AnnotationsExamples {
        @ComponentInfo(name = "annotationsExamples", date = "12-10-2020", currentRevision = 2)
        private String someField;

        public AnnotationsExamples(@InputArgs(doubleValue = 7) final String someField) { //intValue is set to the default
            this.someField = someField;
        }
    }
}
