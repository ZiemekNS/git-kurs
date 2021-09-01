package com.example.oop.basics.inheritance.polymorphism_basics;

class Employee {
    private String name;
    private String jobTitle;
    private int salary;

    public Employee() {
        name = "unknown";
        jobTitle = "unknown";
        salary = 4000;
    }

    public Employee(String name, String jobTitle, int salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

class Manager extends Employee {
    private String departmentName;

    public Manager() {
        super();
        departmentName = "unknown";
    }

    public Manager(String name, String jobTitle, int salary, String departmentName) {
        super(name, jobTitle, salary);
        this.departmentName = departmentName;
    }

    public void higherEmployee() {
        System.out.println("Employee hired");
    }

    public void giveRise(Employee employee) {
        System.out.println("Employee got rise");
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}

class Ceo extends Manager {
    private int sharesNumber;

    public Ceo() {
    }

    public Ceo(String name, String jobTitle, int salary, String departmentName, int sharesNumber) {
        super(name, jobTitle, salary, departmentName);
        this.sharesNumber = sharesNumber;
    }

    public void signContract() {
        System.out.println("Contract signed!");
    }

    public int getSharesNumber() {
        return sharesNumber;
    }

    public void setSharesNumber(int sharesNumber) {
        this.sharesNumber = sharesNumber;
    }
}

public class Company {
    public static void main(String[] args) {
        Employee employee = new Employee("Adam", "Programmer", 10000);
        Manager manager = new Manager("Kasia", "Team Leader", 10000, "R&D");

    }
}
