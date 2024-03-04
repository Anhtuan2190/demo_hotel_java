package demo_hotel.controller;


import demo_hotel.model.service.CustomerService;

import java.util.Scanner;

public class CustomerController {
    private static final CustomerService customerService = new CustomerService();
    private final static Scanner SCANNER = new Scanner(System.in);

    public static void controller() {
        System.out.println("Please input your choice");
        System.out.println("""
                1. Add Customer\s
                2. Show all Customer\s
                3. Update Customer\s
                4. Delete Customer\s
                """);
        int input = Integer.parseInt(SCANNER.nextLine());

        switch (input) {
            case 1: customerService.save(); break;
            case 2: customerService.findAll(); break;
            case 3: customerService.update(); break;
            case 4: customerService.delete(); break;
            default:
                System.out.println("Invalid option slected");
                break;
        }
    }

}
