package com.example.gitdemo.pojo;

/**
 * @description:
 * @author: qqzhu.ricky
 * @createDate:
 * @version: 1.0
 */
public class User {
    private String name;

    private Integer age;

    private Double salary;

    public Double getSalary() {
        return salary;
    }


    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
