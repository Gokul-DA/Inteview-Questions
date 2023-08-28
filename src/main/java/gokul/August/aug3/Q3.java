package gokul.August.aug3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Q3 {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(10, "Gokul"));
        EmployeeDetails employeeDetails = employeeList.stream()
                .filter(employee -> employee.getId() == 10)
                .map(employee -> new EmployeeDetails(employee.getId(), employee.getName()))
                .collect(Collectors.collectingAndThen(Collectors.toList(), list -> list.get(0)));

        List<EmployeeDetails> employeeDetailsList = employeeList.stream()
                .filter(employee -> employee.getId() == 10)
                .map(employee -> new EmployeeDetails(employee.getId(), employee.getName()))
                .collect(Collectors.toList());

    }

}

class EmployeeDetails {
    int id;
    String name;

    public EmployeeDetails(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}