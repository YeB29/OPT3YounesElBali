import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;

class Employee implements Observer {
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

    @Override
    public void update (Observable o, Object arg) {
        Warehouse.totalProduct(((int) arg));
    }
}