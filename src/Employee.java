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


    public boolean getEmployeeID(int employeeID) {
        if(this.employeeID== employeeID) {
            return true;
        }
        return false;
    }

    public Boolean getEmployeeName(String employeeName) {
        if (this.employeeName.equals(employeeName)) {
            return true;
        }
        return false;
    }

    public String getEmployeeFunction(String employeeFunction) {
        return employeeFunction;
    }
}




