package com.bluedream.training.mybatisap1.model;


import lombok.Data;

@Data
public class Student {
    private Long id;
    private String name;
    private String passport;

    public Student(Long id, String name, String passport) {
        super();
        this.id = id;
        this.name = name;
        this.passport = passport;
    }

    public Student(String name, String passport) {
        super();
        this.name = name;
        this.passport = passport;
    }


}
