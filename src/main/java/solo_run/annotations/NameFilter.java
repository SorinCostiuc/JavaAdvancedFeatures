package solo_run.annotations;
/*
Annotations built into the language

Various kinds of annotations are defined in Java SE. Some annotation types are used by the Java compiler and some change the behavior of other annotations. Some of the basic and most used are:

    @Deprecated - it allows you to mark a method/class as obsolete and one that should no longer be used.
    @Override - tells the compiler that the element is to replace the element declared in the parent class.
    @SuppressWarnings - tells the compiler to suppress certain warnings it would otherwise generate.

There are also special annotations that can be used to specify other annotations, these are called meta-annotations, e.g.:

    @Documented - auxiliary annotation that can e.g. display documentation with javadoc.
    @Repeatable - the annotation, introduced in Java SE 8, indicates that a particular annotation can be applied more than once on the same element (e.g. a field).
    @Inherited - the annotation indicates that the annotations used are visible during class inheritance.
    @FunctionalInterface - annotation pointing to interface that has one abstract method.

We could use the annotations defined so far on [any] (#use) elements. When defining an annotation intended for use by other programmers, we want to indicate where and at what point such an annotation will be processed. There are two annotations for this:

    @Retention - which specifies the time during which the annotation is visible.
    @Target - which specifies a list of items on which the annotation can be applied.

Using the @Retention annotation we can indicate the following value of thevalue field:

    RetentionPolicy.SOURCE - specifies that the annotation is only visible at the source code level and is ignored by the compiler.
    RetentionPolicy.CLASS - specifies that the annotation is visible to the compiler at compile time but is ignored by the JVM.
    RetentionPolicy.RUNTIME - specifies that the annotation is stored by the JVM so that it can be used at runtime (ie while the program is running).

 */
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.FIELD })
public @interface NameFilter {
}

@NameFilter                       // correct use -> ElementType.TYPE
class NameFilterUsage {

  @NameFilter                     // correct use -> ElementType.FIELD
  private String field;

//  @NameFilter                     // INCORRECT use -> no ElementType.METHOD
//  public void setField(@NameFilter final String field) { // INCORRECT use -> no ElementType.PARAMETER
//    this.field = field;
//  }
}
