package service;

import Model.Employee;
import Model.EmplyeeType;

import java.time.LocalDate;
import java.util.List;

public class EmployeeAssessment {

    public List<Employee> getAllEmployeeByCertainType(List<Employee> employee, EmplyeeType emplyeeType) {

// - Get all employees by certain type
        return employee.stream().filter(employee1 -> employee1.emplyeeType() == emplyeeType).toList();
    }

    public List<Employee> getHowWorkForACertainAmountOfYears(List<Employee> employee, int years) {
        // - Get all employees who are working for a certain amount of years in the company
        return employee.stream().filter(employee1 -> LocalDate.now().getYear() - employee1.companyEntry().getYear() > years).toList();

    }

    public List<Employee> birthdayToday(List<Employee> employee) {
       // - Get all employees who have a birthday today
        return employee.stream()
                .filter(employee1 -> employee1.birthdate().getMonth() == LocalDate.now().getMonth()
                )
                .filter(employee1 ->  employee1.birthdate().getDayOfMonth() == LocalDate.now().getDayOfMonth()).toList();

    }

    public  List<Employee> employeesYoungerThan(List<Employee> employee, int year ){
        //     - Get all employees who are younger than a certain year
        return  employee.stream().filter(employee1 -> employee1.birthdate().getYear() > year).toList();
    }


}
