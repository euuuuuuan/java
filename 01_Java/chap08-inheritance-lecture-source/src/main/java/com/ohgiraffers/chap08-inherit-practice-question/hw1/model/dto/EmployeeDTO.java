package com.ohgiraffers.hw1.model.dto;

public class EmployeeDTO extends PersonDTO {
    private int salary; // 급여
    private String dept; // 부서

    EmployeeDTO() {

    }

    public EmployeeDTO(String name, int age, double height, double weight, int salary, String dept) {
        super(weight, height, age);
        super.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String information() {
        return "";
    }

    @Override
    public String toString() {
        return "EmployeeDTO" +
                super.toString() +
                "salary=" + salary +
                ", dept='" + dept + '\'' +
                ", name='" + name + '\'' ;
    }
}
