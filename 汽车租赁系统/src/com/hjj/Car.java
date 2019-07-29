package com.hjj;

/**
 * 
 * @author 韩家俊
 * @2019年7月23日
 */
public abstract class Car {

	private String carName; // 车名
	private String carType; // 车的品牌
	private String carNumber; // 车牌号
	private int numberOfcar; // 车的数量

	public abstract double rent(int day);

	public abstract void showInfo();

	public Car() {
		super();
	}

	public Car(String carName, String carType, String carNumber, int numberOfcar) {
		super();
		this.carName = carName;
		this.carType = carType;
		this.carNumber = carNumber;
		this.numberOfcar = numberOfcar;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public int getNumberOfcar() {
		return numberOfcar;
	}

	public void setNumberOfcar(int numberOfcar) {
		this.numberOfcar = numberOfcar;
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + ", carType=" + carType + ", carNumber=" + carNumber + ", numberOfcar="
				+ numberOfcar + "]";
	}

}
