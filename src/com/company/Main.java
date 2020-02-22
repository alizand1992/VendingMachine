package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    VendingMachine vm = new VendingMachine();
	    String input = "";
        Scanner in = new Scanner(System.in);

	    while (true) {
	        System.out.println("Please make a selection:\n" +
                    "1. Add Money (In Dollars: 1.10)\n" +
                    "2. Dispense Yellow!\n" +
                    "3. Dispense Red!\n" +
                    "4. Dispense Money.\n" +
                    "q to exit");
	        input = in.nextLine();

	        if (input.equals("q")) {
	            return;
            }

	        double money;
	        int option = 0;

	        try {
	            option = Integer.parseInt(input);
            } catch (Exception e) {
	            input = "";
	            System.err.println("Please enter a valid option.");
            }

	        switch (option) {
                case 1:
                    System.out.println("Please enter the amount: ");
                    input = in.nextLine();

                    try {
                        money = Double.parseDouble(input);
                        vm.addMoney(money);
                    } catch (Exception e) {
                        System.err.println("Please enter a valid money value in dollars");
                    }
                    break;
                case 2:
                    vm.dispenseYellow();
                    System.out.printf("Dispensing Yellow: you have $%.2f remaining.\n", vm.getMoney());
                    break;
                case 3:
                    vm.dispenseRed();
                    System.out.printf("Dispensing Red: you have $%.2f remaining.\n", vm.getMoney());
                    break;
                case 4:
                    System.out.printf("Dispensing your cash of $%.2f.\n", vm.dispenseMoney());
                    break;
                default:
                    System.err.println("Invalid Option! Try Again!");
                    break;
            }
        }
    }
}
