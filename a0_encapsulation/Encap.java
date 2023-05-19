package a0_encapsulation;

public class Encap {

    public static void main(String[] args) {

        Employee emp = new Employee();
        emp.setId(100);
        emp.setName("madhesh");
        emp.setSalary(75000);


        System.out.println("Employee ID == >" +emp.getId());
        System.out.println("Employee ID == >" +emp.getName());
        System.out.println("Employee ID == >" +emp.getSalary());

        System.out.println("Employee object is" +emp);
    }
}
