package annotation;

import java.lang.annotation.*;

/**
 * @author chen
 * @date 2023.04.12 18:39
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Login {
}
