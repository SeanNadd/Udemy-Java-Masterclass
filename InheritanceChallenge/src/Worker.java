import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Worker {
    protected String name, endDate, birthDate;

    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        setBirthDate(birthDate);
        setEndDate(endDate);
    }

    public int getAge(){
        LocalDate ld = stringToLocalDate(birthDate);
        if(ld != null){
            return Period.between(Objects.requireNonNull(stringToLocalDate(birthDate)), LocalDate.now()).getYears();
        }else {
            System.out.println("Cannot get age since age has not been set: ");
            System.out.println("Please retry setting the birth date");
            return -1;
        }
    }

    public double collectPay(){
        return 1.0;
    }

    public void terminate(String endDate){
        setEndDate(endDate);
    }

    public void setBirthDate(String birthDate) {
        stringToLocalDate(birthDate);
        this.birthDate = birthDate;
    }

    public void setEndDate(String endDate) {
        stringToLocalDate(endDate);
        this.endDate = endDate;
    }

    protected LocalDate stringToLocalDate(String date){
        try{
            return LocalDate.parse(date);
        } catch (DateTimeException e){
            System.out.println("Date values are not valid dates. Input date in format 'YYYY-mm-dd', Date has not been set");
            return null;
        }
    }
}
