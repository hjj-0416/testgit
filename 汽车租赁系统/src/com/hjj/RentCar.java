package com.hjj;

import java.util.Scanner;

public class RentCar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Serve serve = new Serve();
		Client clients = new Client();
		serve.client = clients;

		serve.login();
		serve.SaveCar();
		while (true) {
			System.out.println("0:退出 \t1:租轿车\t2:租客车");
			int a = sc.nextInt();
			serve.ServeCar(clients.chooseServe(a));
			if (a == 1) {
				serve.giveSmallCar(clients.chooseCar());
			} else if (a == 2) {
				serve.giveBus(clients.chooseCar());
			} else {
				System.out.println("超出范围，请重新输入：");
				serve.ServeCar(clients.chooseServe(a));
			}
		}
	}
}
