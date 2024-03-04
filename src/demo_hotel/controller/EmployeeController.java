package demo_hotel.controller;

import demo_hotel.model.service.EmployeeService;

import java.util.Scanner;

public class EmployeeController {
    private static final EmployeeService employeeService = new EmployeeService();
    private final static Scanner SCANNER = new Scanner(System.in);

    public static void controller() {
        System.out.println("Please input your choice");
        System.out.println("""
                1. Add Employee\s
                2. Show All Employee\s
                3. Update Employee\s
                4. Delete Employee\s
                """);
        int input = Integer.parseInt(SCANNER.nextLine());

        switch (input) {

            case 1: employeeService.save(); break;
            case 2: employeeService.findAll(); break;
            case 3: employeeService.update(); break;
            case 4: employeeService.delete(); break;
            default: break;

        }
    }
}
