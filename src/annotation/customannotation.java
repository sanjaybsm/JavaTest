package annotation;

import java.lang.annotation.*;

/**
 * Created by Sanjay_Shivanna on 12/29/2017.
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface customannotation {
    String methodAuthor() default "Sanjay";
    String date();
    int revision() default 1;

}
