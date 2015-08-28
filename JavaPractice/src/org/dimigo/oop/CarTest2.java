package org.dimigo.oop;

public class CarTest2 {

	public static void main(String[] args) {
	Car2.setCompany("현대");
	
	Car2[] cars = {
			new Car2("제네시스"), new Car2("아슬란"), new Car2("그랜져")
	};
	for (Car2 car : cars) {
		car.printCar();
	}
	
	System.out.println();
	Car2.setCompany("기아");
	for(Car2 car : cars){
		car.printCar2();
	}
	System.out.println();
	Car2.setCompany("현대");
	for(Car2 car : cars){
		Car2.printCar3(car);
	}
	System.out.println();
	for(Car2 car : cars){
		Car2.printCar4(car);
	}
	System.out.println();
		// TODO Auto-generated method stub

	}

}
