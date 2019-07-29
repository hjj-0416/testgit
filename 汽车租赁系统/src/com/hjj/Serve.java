package com.hjj;

public class Serve {

	SmallCar sCar[] = new SmallCar[4];
	Bus bus[] = new Bus[4];
	Client client;

	public void SaveCar() {

		sCar[0] = new SmallCar("宝马X6", "轿车", "京NY28588", 2, 800);
		sCar[1] = new SmallCar("宝马550i", "轿车", "京CNY3284", 2, 600);
		sCar[2] = new SmallCar("林荫大道", "轿车", "京NT37465", 2, 300);
		sCar[3] = new SmallCar("别克GL8", "轿车", "京NT96968", 2, 600);
		bus[0] = new Bus("金杯x1", "客车", "京6566754", 2, 1500, 800, 16);
		bus[1] = new Bus("金杯x1", "客车", "京8696997", 2, 1500, 800, 16);
		bus[2] = new Bus("金杯x2", "客车", "京9696996", 2, 1500, 800, 34);
		bus[3] = new Bus("金杯x2", "客车", "京8696998", 2, 1500, 800, 34);
	}

	public void login() {
		System.out.println("欢迎登录汽车租赁系统");
	}

	public void ServeCar(int flag) {
		if (flag == 0)
			this.exitSystem();
		if (flag == 1)
			this.displayScar();
		if (flag == 2) {
			this.displayBus();
		}
	}

	public void exitSystem() {
		System.out.println("退出系统！");
		return;
	}

	public void displayScar() {
		System.out.println("车的名字\t车的品牌\t车牌号\t\t可租借数量\t日租费");
		for (SmallCar sc : sCar) {
			sc.showInfo();
		}
		System.out.println("请选择第几辆小轿车：");
	}

	public void displayBus() {
		System.out.println("车的名字\t车的品牌\t车牌号\t\t可租借数量\t车座数\t日租费");
		for (Bus bs : bus) {
			bs.showInfo();
		}
		System.out.println("请选择第几辆客车：");
	}

	public void giveSmallCar(int a) {
		try {
			if (sCar[a - 1].getNumberOfcar() > 0) {
				System.out.println("请选择租借的天数：");
				client.price = sCar[a - 1].rent(client.chooseDay());
				sCar[a - 1].setNumberOfcar(sCar[a - 1].getNumberOfcar() - 1);
				System.out.println("价格是" + client.price);
				client.allPrice += client.price;
			} else if (client.chooseCar() > 4) {
				System.out.println("输入的数超出范围，请重新选择：");
				giveSmallCar(client.chooseCar());
			} else {
				System.out.println("该车已全部被租出！请重新选择：");
				giveSmallCar(client.chooseCar());
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("请输入在数组内的车辆");
		}
	}

	public void giveBus(int a) {
		try {
			if (bus[a - 1].getNumberOfcar() > 0) {
				System.out.println("请选择租借的天数：");
				client.price = bus[a - 1].rent(client.chooseDay());
				bus[a - 1].setNumberOfcar(bus[a - 1].getNumberOfcar() - 1);
				System.out.println("价格是" + client.price);
				client.allPrice += client.price;
			} else if (a > 4) {
				System.out.println("输入的数超出范围，请重新选择：");
				giveBus(client.chooseCar());
			} else {
				System.out.println("该车已全部被租出！请重新选择：");
				giveBus(client.chooseCar());
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("请输入在数组内的车辆");
		}
	}

}
