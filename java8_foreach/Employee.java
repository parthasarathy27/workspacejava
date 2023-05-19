package java8_foreach;

public class Employee {

    private int id;

    private String name;

    private String grade;

    private double salary;


    private float persentage;

    public Employee(int id, String name, String grade, double salary, float persentage) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.salary = salary;
        this.persentage = persentage;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public double getSalary() {
        return salary;
    }

    public float getPersentage() {
        return persentage;
    }
}
