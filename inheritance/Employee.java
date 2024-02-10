package inheritance;
// inherit fromperson.... Inheritance is amechanism in which one object acquires all the properties and behaviours of parent object.
// with the help of extends keyword
public class Employee  extends Person{

    private String employeeId;
    private String department;
    private double salary;

    public Employee(){
        //super() is used to call the constructor of the parent class
        //super();
        //super is set to the first line of the constructor
        super( "john");

        System.out.println("Employee constuctor called");
    }

    public String getEmployeeId(){
        return employeeId;
    }

    public void setEmployeeId(String employeeId){
        this.employeeId = employeeId;
    }

    public String getDepartment(){
        return department;
    }

    public void setDepartment(String department){
        
        this.department = department;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    

    
}
