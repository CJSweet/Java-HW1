public class Employee {

    private int EmployeeID;
    private String EmployeeName;
    private String HireDate;
    private String Position;
    private String Supervisor;

    Employee(){
        EmployeeID = 0;
        EmployeeName = " ";
        HireDate = " ";
        Position = " ";
        Supervisor = " ";
    }

    Employee(int ID, String EName, String StartDate, String Pos, String Svisor) {
        EmployeeID = ID;
        EmployeeName = EName;
        HireDate = StartDate;
        Position = Pos;
        Supervisor = Svisor;
    }

    public int getEmployeeID(){
        return EmployeeID;
    }

    public void setEmployeeID (int EmpID) {
        EmployeeID = EmpID;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName (String Name) {
        EmployeeName = Name;
    }

    public String getHireDate() {
        return HireDate;
    }

    public void setHireDate (String Date) {
        HireDate = Date;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition (String pos) {
        Position = pos;
    }

    public String getSupervisorName() {
        return Supervisor;
    }

    public void setSupervisor (String visor) {
        Supervisor = visor;
    }

    //PT -- override toString instead
    public void EmpSummary() {
        System.out.printf("\nEmployee Name: " + EmployeeName + "\nEmployee ID: " +
         EmployeeID + "\nEmployee Start Date: " + HireDate + "\nPosition: " + Position + "\nSupervisor Name: " + Supervisor);
    }

}
