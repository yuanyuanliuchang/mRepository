package com.chemicalprospecting;

import org.kymjs.kjframe.database.annotate.Id;

public class User {

    // 将id属�?设置为主键，必须有一个主键，
    // 其实如果变量名为�?id'�?_id'默认就是主键
    // 也就是在�?��JavaBean里面必须�?id'�?_id'�?@Id()'注解，否则会报错
    @Id()
    private int id;
    private int age;
    private String Name;
    private String field;

    /************* getter and setter 必须�?*******************/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
