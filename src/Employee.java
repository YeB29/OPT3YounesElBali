import java.util.Scanner;

class Employee {
    private int employeeID;
    private String employeeName;


    public Employee( int employeeID, String employeeName){
        this.employeeID = employeeID;
        this.employeeName = employeeName;
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
    }



