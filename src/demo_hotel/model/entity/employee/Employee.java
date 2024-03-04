package demo_hotel.model.entity.employee;

public class Employee {
    private long id;
    private String employeeCode;
    private String fullName;
    private String date;
    private String sex;
    private String numberPassport;
    private String numberPhone;
    private String email;
    private String level;
    private String location;
    private String wage;

    public String getInfo () {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s\n",
                this.getId(),
                this.getEmployeeCode(),
                this.getFullName(),
                this.getDate(),
                this.getSex(),
                this.getNumberPassport(),
                this.getNumberPhone(),
                this.getEmail(),
                this.getLevel(),
                this.getLocation(),
                this.getWage());
    }

    public Employee(long id, String employeeCode, String fullName, String date, String sex, String numberPassport, String numberPhone, String email, String level, String location, String wage) {
        this.id = id;
        this.employeeCode = employeeCode;
        this.fullName = fullName;
        this.date = date;
        this.sex = sex;
        this.numberPassport = numberPassport;
        this.numberPhone = numberPhone;
        this.email = email;
        this.level = level;
        this.location = location;
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", employeeCode='" + employeeCode + '\'' +
                ", fullName='" + fullName + '\'' +
                ", date='" + date + '\'' +
                ", sex='" + sex + '\'' +
                ", numberPassport='" + numberPassport + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                ", email='" + email + '\'' +
                ", level='" + level + '\'' +
                ", location='" + location + '\'' +
                ", wage='" + wage + '\'' +
                '}';
    }

    public Employee(String employeeCode, String fullName, String date, String sex, String numberPassport, String numberPhone, String email, String level, String location, String wage) {
        this.employeeCode = employeeCode;
        this.fullName = fullName;
        this.date = date;
        this.sex = sex;
        this.numberPassport = numberPassport;
        this.numberPhone = numberPhone;
        this.email = email;
        this.level = level;
        this.location = location;
        this.wage = wage;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNumberPassport() {
        return numberPassport;
    }

    public void setNumberPassport(String numberPassport) {
        this.numberPassport = numberPassport;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getWage() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
    }
}
