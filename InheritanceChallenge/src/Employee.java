public class Employee extends Worker{
    private long employeeId;
    private String hireDate;

    private static long employeeNo = 1;

    public Employee(String hireDate, String name, String birthDate, String endDate) {
        super(name, birthDate, endDate);
        this.employeeId = Employee.employeeNo++;
        this.hireDate = hireDate;
    }

    public void setHireDate(String hireDate) {
        stringToLocalDate(hireDate);
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
