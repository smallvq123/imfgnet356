package com.hand.hap.mybatis.common.query;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by jialong.zuo@hand-china.com on 2017/5/31.
 */
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface JoinCache {

    String joinKey();

    String cacheName();

    String joinColumn();

    class cacheType{};
}
