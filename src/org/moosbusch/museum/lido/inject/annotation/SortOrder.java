/*

 *
 */
package org.moosbusch.museum.lido.inject.annotation;

import com.google.inject.BindingAnnotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @author moosbusch
 */
@BindingAnnotation
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface SortOrder {

}
