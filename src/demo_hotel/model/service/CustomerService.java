package demo_hotel.model.service;

import demo_hotel.model.entity.customer.Customer;
import demo_hotel.model.utils.CustomerType;
import demo_hotel.model.utils.MyReadFile;
import demo_hotel.model.utils.MyWriteFile;

import java.util.List;
import java.util.Scanner;

public class CustomerService {
    private final MyWriteFile myWriteFile = new MyWriteFile();
    private final MyReadFile myReadFile = new MyReadFile();
    private final Scanner SCANNER = new Scanner(System.in);
    private final String DATA_PATH = "src/demo_hotel/model/data/customer.csv";

    public CustomerService() {

    }

    public void findAll() {
        List<Customer> customers = myReadFile.readFileCustomer(DATA_PATH);
        for (Customer customer : customers) {
            System.out.println(customer.toString());
        }
    }

    private String getCustomerType() {
        System.out.println("Please choose customer type \n" +
                "1. Diamond \n" +
                "2.Platinum \n" +
                "3.Gold \n" +
                "4.Silver \n" +
                "5.Member \n"
        );
        int choose = SCANNER.nextInt();
        return switch (choose) {
            case 1 -> String.valueOf(CustomerType.Diamond);
            case 2-> String.valueOf(CustomerType.Platinum);
            case 3 -> String.valueOf(CustomerType.Gold);
            case 4 -> String.valueOf(CustomerType.Silver);
            case 5 -> String.valueOf(CustomerType.Member);
            default -> "";
        };
    }

    private Customer getInfo() {
        System.out.println("Please input name ");
        String fullName = SCANNER.nextLine();
        System.out.println("Please input customer Code ");
        String customerCode = SCANNER.nextLine();
        System.out.println("Please input date of birth ");
        String dateOfBirth = SCANNER.nextLine();
        System.out.println("Please input gender");
        String gender = SCANNER.nextLine();
        System.out.println("Please input identity");
        String identity = SCANNER.nextLine();
        System.out.println("Please input phoneNumber");
        String phoneNumber = SCANNER.nextLine();
        System.out.println("Please input customerType");
        String customerType = getCustomerType();
        System.out.println("Please input address");
        String address = SCANNER.nextLine();
        return new Customer(fullName, customerCode, dateOfBirth, gender, identity, phoneNumber, customerType, address);
    }

    public void save() {
        List<Customer> customers= myReadFile.readFileCustomer(DATA_PATH);
        long id = customers.get(customers.size() - 1).getId() + 1;
        Customer customer = getInfo();
        customer.setId(id);
        customers.add(customer);
        myWriteFile.writeCustomerFile(DATA_PATH, customers);
    }

    public void update() {

    }

    public void delete() {

    }
}
