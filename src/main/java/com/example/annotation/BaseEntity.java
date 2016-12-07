package com.example.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * 所有实体类的基类
 */
@InheritedAnnotation
public class BaseEntity {
    public void test() {
        String toShowMessage = "";

        Class entityClass = this.getClass();

        /** 获取表名信息 */
        if (entityClass.isAnnotationPresent(Table.class)) {
            Table table = (Table) entityClass.getAnnotation(Table.class);
            toShowMessage += "Table: " + table.value() + "\n";
        }

        /** 获取列名信息 */
        Field[] entityFields = entityClass.getDeclaredFields();
        for (Field field :
                entityFields) {
            if (field.isAnnotationPresent(Column.class)) {
                Column column = field.getAnnotation(Column.class);
                toShowMessage += column.value() + " : ";

                Object value = null;
                try {
                    field.setAccessible(true);

                    value = field.get(this);
                    toShowMessage += value + "\n";

                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        /**
         * 这里你就可以获取到Entity的信息
         * 然后执行正真的数据库操作
         */
        //ORM框架可以在这里执行数据库操作

        /**
         * 下面看下getAnnotations跟getDeclaredAnnotations的区别
         */
        toShowMessage += "getAnnotations(): ";
        Annotation[] getAnnotations = entityClass.getAnnotations();
        for (Annotation annotation :
                getAnnotations) {
            toShowMessage += annotation.toString() + "     ";
        }

        toShowMessage += "\ngetDeclaredAnnotations(): ";
        Annotation[] getDeclaredAnnotations = entityClass.getDeclaredAnnotations();
        for (Annotation annotation :
                getDeclaredAnnotations) {
            toShowMessage += annotation.toString() + " ";
        }

        System.out.println(toShowMessage);
    }
}
