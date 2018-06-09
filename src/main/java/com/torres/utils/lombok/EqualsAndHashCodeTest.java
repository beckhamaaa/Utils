package com.torres.utils.lombok;

/**
 * Created by Torres on 2018-05-23 13:37.
 */
//@EqualsAndHashCodeTest(exclude = {"id", "shape"}, callSuper = false)
//用在类上，自动生成equals方法和hashCode方法
public class EqualsAndHashCodeTest {
    private int id;
    private String shap;
}
