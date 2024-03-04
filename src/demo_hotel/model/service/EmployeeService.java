package demo_hotel.model.service;

import demo_hotel.model.entity.employee.Employee;
import demo_hotel.model.utils.MyReadFile;
import demo_hotel.model.utils.MyWriteFile;

import java.util.List;
import java.util.Scanner;

public class EmployeeService {
    private final MyWriteFile myWriteFile = new MyWriteFile();
    private final MyReadFile myReadFile = new MyReadFile();
    private final Scanner SCANNER = new Scanner(System.in);
    private final String DATA_PATH = "src/demo_hotel/model/data/employee.csv";

    public EmployeeService() {

    }
    public void findAll() {
        List<Employee> employees = myReadFile.readFileEmployee(DATA_PATH);
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

    private Employee getInfo() {
        System.out.println("Please input employee code");
        String employeeCode = SCANNER.nextLine();
        System.out.println("Please input fullName");
        String fullName = SCANNER.nextLine();
        System.out.println("Please input date");
        String date = SCANNER.nextLine();
        System.out.println("Please input sex");
        String sex = SCANNER.nextLine();
        System.out.println("Please input number passport");
        String numberPassport = SCANNER.nextLine();
        System.out.println("Please input number phone");
        String numberPhone = SCANNER.nextLine();
        System.out.println("Please input email");
        String email = SCANNER.nextLine();
        System.out.println("Please input level");
        String level = SCANNER.nextLine();
        System.out.println("Please input location");
        String location = SCANNER.nextLine();
        System.out.println("Please input wage");
        String wage = SCANNER.nextLine();

        return new Employee(employeeCode, fullName, date, sex, numberPassport, numberPhone, email, level, location, wage );
    }

    public void save() {
        List<Employee> employees = myReadFile.readFileEmployee(DATA_PATH);
        long id = employees.get(employees.size() - 1).getId() + 1;
        Employee employee = getInfo();
        employee.setId(id);
        employees.add(employee);
        myWriteFile.writeEmployee (DATA_PATH, employees);

    }

    public void update() {

    }
    public void delete() {

    }
}
