package com.jm2190615.annotation.custom;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Documented
@Retention(RUNTIME)
@Target(TYPE)
public @interface ClassInfo {
	String author() default "James";

	int version() default 1;

	String createdOn() default "Today";

	String[] reviewers() default { "Rob" };
}
