package com.company.generics;

import java.util.HashSet;
import java.util.Set;
class Employee {
    //assume it has 3 variable name(String),salary(double) and id(int)
    //assume the constructor, getter-setters are there
    int id;
    String name;
    int salary;
    String dept;

    Employee(int id,String name, int salary,String dept){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.dept=dept;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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


}

public class Question1 {
    public static void main(String[] args) {
         Employee e1=new Employee(101,"Priya",50000,"Developer");
        Employee e2=new Employee(102,"Pallavi",50000,"Testing");
        Employee e3=new Employee(103,"Riya",40000,"HR");
        Employee e4=new Employee(104,"Priya",50000,"Developer");
        Employee e5=new Employee(105,"Priya",50000,"Developer");


         Set<Employee> set=new HashSet<>();
         set.add(e1);
         set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);
//        set.add(5);--will give error

    }
}
