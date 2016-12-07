package com.example.annotation;

/**
 * 用户表
 */
@Table("User")
public class User extends BaseEntity {
    @Column("id")
    private String id = "123456";

    @Column("name")
    private String name = "Jayme";

//    public static void main(String[] args) {
//        User user = new User();
//        user.test();
//    }
}
