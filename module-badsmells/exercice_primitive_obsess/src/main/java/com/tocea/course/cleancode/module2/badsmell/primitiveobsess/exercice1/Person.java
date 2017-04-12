package com.tocea.course.cleancode.module2.badsmell.primitiveobsess.exercice1;


/**
 * Created by kfahy on 12.04.2017.
 */
public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private int salary;

    public static Person fromStringRepresentation(String _personalData) {
        final String[] split = _personalData.split(":");

        final Person person = new Person();
        person.setFirstName(split[0]);
        person.setLastName(split[1]);
        person.setAge(Integer.valueOf(split[2]));
        person.setSalary(Integer.valueOf(split[3]));
        return person;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
