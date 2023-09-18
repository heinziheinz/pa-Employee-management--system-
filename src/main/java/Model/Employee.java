package Model;

import java.time.LocalDate;

public record Employee(int id, String firstname, String lastName, LocalDate birthdate, EmplyeeType emplyeeType, LocalDate companyEntry) {
}

//        In a company employees have an id, a firstname, a lastname, and a birthdate.
//        An employee can be of type technician or sales.
//        An employee has further his company entry date.
