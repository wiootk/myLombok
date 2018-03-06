package com.jun;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})//对类的注解
@Retention(RetentionPolicy.SOURCE)//只在编译期起作用
public @interface MyLombok {
}
