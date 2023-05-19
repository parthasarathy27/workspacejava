package array_example;

public class employee {
    int id;
    String name;
    double salary;
    int age;
    double cutoff;

    public employee(int id, String name, double salary, int age, double cutoff) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.cutoff = cutoff;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public double getCutoff() {
        return cutoff;
    }
}
