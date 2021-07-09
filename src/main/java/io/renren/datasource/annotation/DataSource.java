/**
 * Copyright (c) 2018 人人开源 All rights reserved.
 * <p>
 * https://www.renren.io
 * <p>
 * 版权所有，侵权必究！
 */

package io.renren.datasource.annotation;

import java.lang.annotation.*;

/**
 * 多数据源注解
 * METHOD:用于描述方法
 * @Retention(RetentionPolicy.RUNTIME)TYPE用于描述类
 *注解不仅被保存到class文件中
 * @author Mark sunlightcs@gmail.com
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface DataSource {
    String value() default "";
}
