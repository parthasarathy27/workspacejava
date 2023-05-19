package array_example;

import java.util.ArrayList;
import java.util.List;

public class listpojo {

    public static void main(String[] args) {
        System.out.println("ID" + " | " + "NAME" + " | " + "Salary" + " | " + "AGE" + " | " + "CUTOFF");

        List<employee> employee = new ArrayList<>();
        employee.add(new employee(01,"Madhesh",10000.00,40,90.2 ));
        employee.add(new employee(02,"Praveen", 30000.00,30, 90.5 ));
        employee.add(new employee(03,"sarathanantha", 50000,-200, 99.7 ));

        for (employee emp : employee) {
            System.out.println(emp.getId() + " | " + emp.getName() + " | " + emp.getSalary() + " | " + emp.getAge() + " | " + emp.getCutoff());
        }
    }
}