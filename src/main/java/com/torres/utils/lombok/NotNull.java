package com.torres.utils.lombok;

import lombok.NonNull;

/**
 * @NonNull
 * Created by Torres on 2018-05-23 12:19.
 */
public class NotNull {
//    给方法参数增加这个注解会自动在方法内对该参数进行是否为空的校验，
//    如果为空，则抛出NPE（NullPointerException）
    public void notNullExample1(@NonNull String string) {
        string.length();
    }

    //=>相当于
    public void notNullExample2(String string) {
        if (string != null) {
            string.length();
        } else {
            throw new NullPointerException("null");
        }
    }

}
