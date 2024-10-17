public class Employee {
    private final int id;
    private final String fullName;
    private int salary;
    private int  department;
    private  static int count =0;
    public Employee(final String fullName,int salary,int department) {
        this.fullName =fullName;
        this.salary= salary;
        this.department= department;
        this.id=++count;

    }


    public final int getId(){ return id;}

    public final String getFullName(){ return fullName;}

    public final int getSalary(){ return salary;}
    public void setSalary(int salary){this.salary=salary;}

    public final int getDepartment(){ return department;}
    public void setDepartment(int department){this.department=department;}


}
