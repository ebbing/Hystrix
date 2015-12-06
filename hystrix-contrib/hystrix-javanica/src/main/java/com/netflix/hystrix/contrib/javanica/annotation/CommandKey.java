package com.netflix.hystrix.contrib.javanica.annotation;

import java.lang.annotation.*;

/**
 * This annotation specifies a parameter of a hystrix command method to use its value
 * as the hystrix command key.
 */
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CommandKey {
}
