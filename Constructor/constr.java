package Constructor;

public class constr {

    public static void main(String[] args) {

        empconst employee = new empconst(1, "madhesh", 850000.00);
        System.out.println("Employee ID ==>" +employee.id);
        System.out.println("Employee Name ==>" +employee.name);
        System.out.println("Employee Salary ==>" +employee.salary);

        System.out.println("Employee Object ==>" +employee);
    }
}
