package com.speldipn.example.this_is_java.ch06.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-19
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintAnnotation {
  String value() default "-";
  int number() default 15;
}
