/*
 * Copyright Hand China Co.,Ltd.
 */

package com.hand.hap.core.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.hand.hap.extensible.base.IServiceListener;

/**
 * 多语言特性注解.
 * 
 * @author shengyang.zhou@hand-china.com
 */
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface ServiceListener {
    Class<?> target();

    Class<? extends IServiceListener>[] before() default {};

    Class<? extends IServiceListener>[] after() default {};
}