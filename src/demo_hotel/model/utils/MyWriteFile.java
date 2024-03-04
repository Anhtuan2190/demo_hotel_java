package demo_hotel.model.utils;

import demo_hotel.model.entity.customer.Customer;
import demo_hotel.model.entity.employee.Employee;

import java.io.*;
import java.util.List;

public class MyWriteFile {
    private void writeFile(String path, String data) {
        File file = new File(path);
        try {
            Writer writerFile = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(writerFile);
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void writeCustomerFile(String path, List<Customer> customerList) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Customer customer : customerList) {
            stringBuilder.append(customer.getInfo());
        }
        writeFile(path, String.valueOf(stringBuilder));
    }

    public void writeEmployee(String path, List<Employee> employeeList) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Employee employee : employeeList) {
            stringBuilder.append(employee.getInfo());
        }
        writeFile(path, String.valueOf(stringBuilder));
    }
}
