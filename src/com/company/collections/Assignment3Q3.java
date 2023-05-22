package com.company.collections;


import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

/*3) Store at least 10 Employee Objects in an TreeSet<Employee>. When the application runs the
        user should be asked to select one of the options upon which you will print the employee
        details in a sorted manner.
        For E.g.
        Run Application:
        a) ID
        b) Name
        c) Department
        d) Salary
        Your choice: b
<Should print all the employee’s details sorted by name>*/
class Employee{
    int id;
    String name,department;
    double salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    Employee(int id, String  name, String department, double salary){
        this.id=id;
        this.name=name;
        this.department=department;
        this.salary=salary;
    }
    public String toString(){
        return "id: "+id+" name: "+name+" department: "+department+" salary: "+salary;
    }
}
public class Assignment3Q3 {
    public static void main(String[] args) {
        Employee obj = new Employee(101, "priya", "Testing", 35000);
        Employee obj1 = new Employee(102, "pallavi", "HR", 35000);
        Employee obj2 = new Employee(103, "riya", "Developer", 35000);
        Employee obj3 = new Employee(104, "akshat", "Sells", 35000);
        Employee obj4 = new Employee(105, "saksham", "Testing", 35000);
        Employee obj5 = new Employee(106, "tanu", "Developer", 35000);
        Employee obj6 = new Employee(107, "achal", "Testing", 35000);
        Employee obj7 = new Employee(108, "ashu", "HR", 35000);
        Employee obj8 = new Employee(109, "kajal", "Sells", 35000);
        Employee obj9 = new Employee(110, "aisha", "Testing", 35000);
        HashSet<Employee> set=new HashSet<>();
        set.add(obj);
        set.add(obj1);
        set.add(obj2);
        set.add(obj3);
        set.add(obj4);
        set.add(obj5);
        set.add(obj6);
        set.add(obj7);
        set.add(obj8);
        set.add(obj9);

        System.out.println("Enter your choice: ");
        System.out.println("1.ID\n2.Name\n3.Department\n4.Salary");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        switch (ch) {

            case 1:
                class IdComp implements Comparator<Employee> {

                    @Override
                    public int compare(Employee e1, Employee e2) {
//                        return new Integer(e1.getId()).compareTo(new Integer(e2.getId()));
                        if(e1.getId()>(e2.getId())) return 1;
                        if(e1.getId()<(e2.getId())) return -1;
                        else return 0;
                    }

                }
//                System.out.println(toString());
                for (Employee e:set) {
                    System.out.println(e.toString());
                }
                break;
            case 2:
                class NameComp implements Comparator<Employee> {

                    @Override
                    public int compare(Employee e1, Employee e2) {
                        return e1.getName().compareTo(e2.getName());
                    }

                }
//                System.out.println(t);
                break;

            case 3:
                class DeptComp implements Comparator<Employee> {

                    @Override
                    public int compare(Employee e1, Employee e2) {
                        return e1.getDepartment().compareTo(e2.getName());
                    }

                }
            case 4:
                class SalaryComp implements Comparator<Employee> {

                    @Override
                    public int compare(Employee e1, Employee e2) {
                        if(e1.getSalary()>(e2.getSalary())) return 1;
                        if(e1.getSalary()<(e2.getSalary())) return -1;
                        else return 0;

                    }

                }
        }

    }




}
