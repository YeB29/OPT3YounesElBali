import java.util.Scanner;

class Employee {
    private int employeeID;
    private String employeeName;
    private String employeeFunction;

    public Employee( int employeeID, String employeeName, String employeeFunction){
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeeFunction = employeeFunction;
    }


    public int getEmployeeID() {
        return employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeFunction() {
        return employeeFunction;
    }
}




