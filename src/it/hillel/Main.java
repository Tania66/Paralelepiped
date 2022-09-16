package it.hillel;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

		Random random = new Random();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Write a number from 1 to 6");
		int number = scanner.nextInt();

		if (number == random.nextInt(6)) {
			System.out.println("You WIN!");
		} else {
			System.out.println("You lost!");
			System.out.println(random.nextInt(6));
		}
	}
}
