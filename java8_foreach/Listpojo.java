package java8_foreach;

import array_example.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listpojo {

    public static void main(String[] args) {

        List<Employee> lstemp = new ArrayList<>();
        lstemp.add(new Employee(01,"Madhesh","C2", 50000.00, 50));
        lstemp.add(new Employee(02,"Praveen","C5",40000.00,50));
        lstemp.add(new Employee(03,"sarathanantha","C2",40000.00,50));
        lstemp.add(new Employee(04,"Merwin","C6", 30000.00,40));
        lstemp.add(new Employee(05,"Nijanthan","C2", 20000.00, 30));
        lstemp.add(new Employee(06,"badhri","C9", 450000.00, 40));

        lstemp.forEach(System.out::println);

        lstemp.forEach(i -> System.out.println(i));

        lstemp.forEach(i -> {
            System.out.println("ID ====> "+i.getId());
            System.out.println("NAME ====> "+i.getName());
            System.out.println("GRADE ====> "+i.getGrade());
            System.out.println("SALARY ====> "+i.getSalary());
            System.out.println("PERSENTAGE ====> "+i.getPersentage());
        });

        List<Employee> ls = lstemp.stream().filter(i -> i.getGrade().equals("C2")).collect(Collectors.toList());
        System.out.println(ls);
        System.out.println(ls.size());
    }
}
