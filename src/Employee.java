public class Employee {
    private final String fullName;
    private int department;
    private int salary;
    private static int counter;
    private final int id;


    public String getFullName() {
        return this.fullName;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }


    public void setDepartment(int department) { this.department = department; }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        id = ++counter;
    }

    @Override
    public String toString() {
        return "id: " + id + ". " +
                fullName +
                ". Департамент \"" + department + "\""
                + ". Зарплата: " + salary + " рублей.";
    }
}


