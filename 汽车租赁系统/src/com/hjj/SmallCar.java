package com.hjj;

public class SmallCar extends Car {

	private double dayRent; // 日租金

	public SmallCar() {
		super();
	}

	public SmallCar(String carName, String carType, String carNumber, int numberOfcar, double dayRent) {
		super(carName, carType, carNumber, numberOfcar);
		this.dayRent = dayRent;
	}

	@Override
	public void showInfo() {
		System.out.println(this.getCarName() + "\t" + this.getCarType() + "\t" + this.getCarNumber() + "\t"
				+ this.getNumberOfcar() + "\t" + this.dayRent);
	}

	@Override
	public double rent(int day) {
		if (day > 7) {
			return day * dayRent * 0.9;
		} else if (day > 30) {
			return day * dayRent * 0.8;
		} else if (day > 150) {
			return day * dayRent * 0.7;
		} else {
			return day * dayRent * 1.0;
		}
	}
}
