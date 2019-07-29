package com.hjj;

public class Bus extends Car {

	private double dayRent1; // 日租金
	private double dayRent2; // 日租金
	private int carSeat; // 车的座位数

	public Bus() {
		super();
	}

	public Bus(String carName, String carType, String carNumber, int numberOfcar, double dayRent1, double dayRent2,
			int carSeat) {
		super(carName, carType, carNumber, numberOfcar);
		this.dayRent1 = dayRent1;
		this.dayRent2 = dayRent2;
		this.carSeat = carSeat;
	}

	@Override
	public void showInfo() {
		System.out.print(this.getCarName() + "\t" + this.getCarType() + "\t" + this.getCarNumber() + "\t"
				+ this.getNumberOfcar() + "\t" + this.carSeat + "\t");
		if (carSeat > 16) {
			System.out.println(dayRent1);
		} else {
			System.out.println(dayRent2);
		}
	}

	@Override
	public double rent(int day) {
		if (carSeat > 16) {
			if (day > 3) {
				return dayRent1 * day * 0.9;
			} else if (day > 7) {
				return dayRent1 * day * 0.8;
			} else if (day > 30) {
				return dayRent1 * day * 0.7;
			} else if (day > 150) {
				return dayRent1 * day * 0.6;
			} else {
				return dayRent1 * day;
			}
		} else {
			if (day > 3) {
				return dayRent2 * day * 0.9;
			} else if (day > 7) {
				return dayRent2 * day * 0.8;
			} else if (day > 30) {
				return dayRent2 * day * 0.7;
			} else if (day > 150) {
				return dayRent2 * day * 0.6;
			} else {
				return dayRent2 * day;
			}
		}
	}

}
