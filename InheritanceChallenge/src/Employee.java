public class Employee extends Worker{
    private long employeeId;
    private String hireDate;

    public Employee(long employeeId, String hireDate, String name, String birthDate, String endDate) {
        super(name, birthDate, endDate);
        this.employeeId = employeeId;
        this.hireDate = hireDate;
    }

    public void setHireDate(String hireDate) {
        stringToLocalDate(hireDate);
        this.hireDate = hireDate;
    }
}
