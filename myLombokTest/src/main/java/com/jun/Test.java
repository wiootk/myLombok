package com.jun;

@MyLombok
public class Test {
    private String name;
    private int age;
    public Test(String name,int age) {
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return String.format("{ '%s':%s ,'%s':%d}", "name", this.name, "age", this.age);
    }
    public static void main(String[] args) {
        Test app = new Test("大明",12);
        System.out.println(app.toString());
    }
}
