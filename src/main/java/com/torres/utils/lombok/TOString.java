package com.torres.utils.lombok;

import lombok.ToString;

/**
 * @ToString
 * Created by Torres on 2018-05-23 13:20.
 */
@ToString(exclude = "id", callSuper = true, includeFieldNames = true)
//    用在类上，可以自动覆写toString方法，当然还可以加其他参数，
//    例如@TOString(exclude=”id”)排除id属性，或者
//    @TOString(callSuper=true, includeFieldNames=true)调用父类的toString方法，包含所有属性
public class TOString {
        private int id;
        private String name;
        private int age;

        public static void main(String[] args) {
            //输出LombokDemo(super=LombokDemo@48524010, name=null, age=0)
            System.out.println(new TOString());
        }
}
