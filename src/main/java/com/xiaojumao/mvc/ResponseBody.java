package com.xiaojumao.mvc;

import java.lang.annotation.*;

/**
 * @Author: whw
 * @Description:
 * @Date Created in 2021-06-30 10:54
 * @Modified By:
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
/**
 * 注解的作用:
 * 被此注解添加的方法,会被用于处理请求.
 * 方法返回的内容,会以文字形式返回到客户端
 */
public @interface ResponseBody {
    String value();
}
