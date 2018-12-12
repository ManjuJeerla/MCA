package com.nt.minidatabase;

import java.util.Scanner;

public class Clerk {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		CollectionDB db=new CollectionDB();
		
		System.out.println("/n Choose Option");
		System.out.println("1. Create Account");
		System.out.println("2.Account type");
		System.out.println("3.Exit");
		System.out.println("Choose Option");
		int option=sc.nextInt();
		System.out.println();
		
		switch (option) {
		case 1:
			AccountBean bean=new AccountBean();
            System.out.println("Enter Account number:");
            bean.setAccNum(sc.nextInt());
            System.out.println("Enter AccHName");
            bean.setAccHName(sc.next());
            System.out.println("Enter AccType");
            bean.setAccType(sc.next());
            System.out.println("set balance");
            bean.setBalance(sc.nextDouble());
            
            db.addAccount(bean);
            System.out.println("Account is created");
			
			break;
			
		case 2:
			System.out.println("Enter AccNum");
			long accNum=sc.nextLong();
			System.out.println("AccType");
			String accType=sc.next();
			bean=db.getAccount(3256489L, "savings");
		if(bean!=null) {	
			System.out.println("Current bal::"+bean.getBalance());
		}
		else {
			System.out.println("Account number is wrong");
		}
		break;
		
		case 3:
		
		default:
			System.out.println("Invalid Option");;
		}
		

	}

}
