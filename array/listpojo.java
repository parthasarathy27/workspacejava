package array;

import java.util.ArrayList;
import java.util.List;

public class listpojo {

    public static void main(String[] args) {

        List<employee> employee = new ArrayList<>();
        employee.add(new employee(1,"Madhesh",10000.00));
        employee.add(new employee(2,"Praveen", 30000.00));
        employee.add(new employee(3,"sarathanantha", 50000));

        for (employee emp : employee) {
            System.out.println(emp.getId() + "-" + emp.getName() + "-" + emp.getSalary());
        }
    }

}
