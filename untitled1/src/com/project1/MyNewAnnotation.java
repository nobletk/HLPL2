package com.project1;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

//@Target(ElementType.METHOD)
@Documented
public @interface MyNewAnnotation {
    public String name() default "Tarek";
    public int id() default 1;
}
