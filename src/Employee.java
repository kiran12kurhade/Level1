public class Employee {
    int id;
    String name;
    float salary;

    Employee() {}

    Employee(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;

    }

    void yearlySalary() {
        System.out.println("Monthly salary is " + salary*12);
    }
    void nameAndSalary() {
        System.out.println("Name :" + name + " and salary is " + salary);
    }
    public static void main(String[] args) {
        Employee emp = new Employee(1,"Kiran",27000);
        emp.yearlySalary();
        emp.nameAndSalary();


    }
}
