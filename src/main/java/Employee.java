public abstract class Employee {

    private String name;
    private String NInumber;
    private int salary;

    public Employee(String name, String NInumber, int salary) {
        this.name = name;
        this.NInumber = NInumber;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public String getNInumber(){
        return NInumber;
    }

    public int getSalary(){
        return salary;
    }
    public void raiseSalary(double raise) {
        this.salary += raise;
    }
}
