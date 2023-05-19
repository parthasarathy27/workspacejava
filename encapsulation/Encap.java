package encapsulation;

public class Encap {

    public static void main(String[] args) {

        employee emp = new employee();
        emp.setId(100);
        emp.setName("Madhesh");
        emp.setSalary(85000.00);

        System.out.println("employee ID ==>" +emp.getId());
        System.out.println("employee NAME ==>" +emp.getName());
        System.out.println("employee SALARY ==>" +emp.getSalary());

        System.out.println("employee object is" +emp);
    }
}
