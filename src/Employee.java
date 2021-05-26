class Employee {
    private Integer employeeID;
    private String employeeName;
   ;

    public Employee(String employeeName, Integer employeeID){
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    public Integer getEmployeeID() {
        return employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }


}
