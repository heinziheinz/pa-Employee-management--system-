package service;

import Model.Employee;
import Model.EmplyeeType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EmployeeAssessmentTest {
    LocalDate companyEntryFrank;
    LocalDate frankBirthday;
    Employee employee1;
    Employee employee2;
    Employee employee3;
    Employee employee4;
    Employee employee5;
    EmployeeAssessment employeeAssessment;

    @BeforeEach
    void setUp() {
        employeeAssessment = new EmployeeAssessment();
        companyEntryFrank = LocalDate.of(2010, 5, 15); // Replace with Frank's actual entry date
        frankBirthday = LocalDate.of(1990, 5, 15); // Replace with Frank's actual birthdate

        employee1 = new Employee(1, "Frank", "Stward", frankBirthday, EmplyeeType.TECHNICIAN, companyEntryFrank);

        // Create five more employees using the same structure
        employee2 = new Employee(2, "Alice", "Johnson", LocalDate.of(1985, 8, 23), EmplyeeType.SALES, LocalDate.of(2008, 3, 10));
        employee3 = new Employee(3, "Bob", "Smith", LocalDate.of(1992, 12, 7), EmplyeeType.TECHNICIAN, LocalDate.of(2015, 6, 22));
        employee4 = new Employee(4, "Eva", "Brown", LocalDate.of(1988, 4, 14), EmplyeeType.SALES, LocalDate.of(2012, 9, 17));
        employee5 = new Employee(5, "John", "Doe", LocalDate.of(1995, 9, 18), EmplyeeType.TECHNICIAN, LocalDate.of(2019, 11, 5));
    }

    @Test
    void getAllEmployeeByCertainType() {
        List<Employee> employeees = List.of(employee1, employee2, employee3, employee4);
        List<Employee> myEmplooyees = employeeAssessment.getAllEmployeeByCertainType(employeees, EmplyeeType.SALES);
        assertTrue(true);
        assertEquals(2, myEmplooyees.size());
    }

    @Test
    void getHowWorkForACertainAmountOfYears() {
        List<Employee> employeees = List.of(employee1, employee2, employee3, employee4);
        List<Employee> myEmplooyees = employeeAssessment.getHowWorkForACertainAmountOfYears(employeees, 13);
        assertTrue(true);
        System.out.println(myEmplooyees.size());
        assertEquals(1, myEmplooyees.size());
    }

    @Test
    void birthdayToday() {
        List<Employee> employeees = List.of(employee1, employee2, employee3, employee4, employee5);
        List<Employee> birthdayBoys = employeeAssessment.birthdayToday(employeees);

        assertEquals(1, birthdayBoys.size());
    }

    @Test
    void employeesYoungerThan() {
        //     - Get all employees who are younger than a certain year
        List<Employee> employeees = List.of(employee1, employee2, employee3, employee4, employee5);
        List<Employee> birthdayBoys = employeeAssessment.employeesYoungerThan(employeees, 1988);
        assertEquals(3, birthdayBoys.size());
    }
}