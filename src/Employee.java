public class Employee {
    private String id;
    private String name;
    private String lastName;
    private String position;
    private double salary;

    public Employee(String id,String name, String lastName, String position, double salary) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.position = position;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }
}
