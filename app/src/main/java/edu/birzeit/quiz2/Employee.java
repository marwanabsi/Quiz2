package edu.birzeit.quiz2;

public class Employee {
    private String name;
    private String salary;
    private String staus;

    public Employee(String name, String salary, String staus) {
        this.name = name;
        this.salary = salary;
        this.staus = staus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getStaus() {
        return staus;
    }

    public void setStaus(String staus) {
        this.staus = staus;
    }
}
