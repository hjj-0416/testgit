package com.hjj;

import java.util.Scanner;

public class Client {

	public double price; // 单量车价格
	public double allPrice; // 总价

	public int chooseServe(int flag) {
		if (flag == 0) {
			System.out.println("租车总金额为" + this.allPrice);
		}
		return flag;
	}

	public int chooseCar() {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		return number;
	}

	public int chooseDay() {
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		return day;
	}
}
