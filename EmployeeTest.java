public class EmployeeTest {
    public static void main(String[] args){
        Employee t1 = new Employee();
        Employee t2 = new Employee(123, "Casey Sweet", "1-4-19", "Rookie", "Pete Tucker");

        t1.EmpSummary();
        t1.setEmployeeID(333);
        t1.EmpSummary();

        t2.EmpSummary();
     }

}