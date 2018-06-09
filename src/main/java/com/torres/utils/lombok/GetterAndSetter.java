package com.torres.utils.lombok;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/**
 * @Getter   @Setter
 * Created by Torres on 2018-05-23 13:19.
 */
public class GetterAndSetter {
//    用在属性上，再也不用自己手写setter和getter方法了，还可以指定访问范围
//    有五种范围：PUBLIC, MODULE, PROTECTED, PACKAGE, PRIVATE,
    @Setter(AccessLevel.PUBLIC)
    @Getter(AccessLevel.PROTECTED)
    private int id;
    private String shap;
}
