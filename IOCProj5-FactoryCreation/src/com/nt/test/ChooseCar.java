package com.nt.test;

import java.io.ObjectInputStream.GetField;
import com.nt.factory.SuzukiCarFactory;

import com.nt.car.SuzukiCar;

public class ChooseCar {

	public static void main(String[] args) {
		SuzukiCar car=null;
		car=SuzukiCarFactory.getInstance("baleno");
		System.out.println(car.drive());
		System.out.println(car.specification());

	}

}
