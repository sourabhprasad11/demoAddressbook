package com.demo;

import java.util.Scanner;

public class demo1 {

	public static void main(String[] args) {
int ans;
		
		
		System.out.println("1. New AddressBook");
		System.out.println("2. Open AddressBook");
		System.out.println("3. Save AddressBook");
		System.out.println("4. SaveAs AddressBook");
		System.out.println("5. Close AddressBook");
		System.out.println("0. Quit");
		
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the number from above: ");
		ans=ip.nextInt();
		do {
		switch(ans) {
			case 1: 
					//abi.newAddressBook();
					System.out.println("working");
					break;
			case 2: 
					//abi.openAddressBook();
					System.out.println("working");
				break;
			case 3: 
					//abi.saveAddressBook();
					System.out.println("working");
				break;
			case 4: 
					//abi.saveasAddressBook();
					System.out.println("working");
				break;
			case 5: 
					//abi.closeAddressBook();
					System.out.println("working");
				break;
			case 6: 
					//abi.quit();
					//changed
					System.exit(0);
					System.out.println("working");
				break;
			default:
					System.out.println("You have entered the wrong number...Terminating the application");
					ans=0;
				break;
			}
		}while(ans!=0);
			
		



	}

}
